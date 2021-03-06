package com.ty.dao;

import com.ty.entity.Employee;
import com.ty.entity.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_employee
     *
     * @mbggenerated Thu Jan 04 01:54:49 CST 2018
     */
    int updateByPrimaryKey(Employee record);
}