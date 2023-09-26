package com.xiangyin.mapper;

import com.xiangyin.pojo.Employee;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface EmployeeMapper {
    List<Employee> queryList();
}
