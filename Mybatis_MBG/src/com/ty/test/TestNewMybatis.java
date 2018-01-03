package com.ty.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.ty.dao.EmployeeMapper;
import com.ty.entity.Employee;
import com.ty.entity.EmployeeExample;
import com.ty.entity.EmployeeExample.Criteria;

public class TestNewMybatis {
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testMBG() throws Exception, Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("mbg.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
	@Test
	public void testCRUDMybatis3() throws Exception {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
		//封装查询条件的,null的时候就是查询所有
		List<Employee> employees = employeeMapper.selectByExample(null);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		//封装查询条件：gender是1的
		EmployeeExample employeeExample = new EmployeeExample();
		//这个就是拼装查询条件的
		Criteria criteria = employeeExample.createCriteria();
		criteria.andGenderEqualTo("1");
		List<Employee> employees2 = employeeMapper.selectByExample(employeeExample);
		for (Employee employee : employees2) {
			System.out.println(employee);
		}
	}
}
