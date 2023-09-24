package com.xiangyin.service.impl;

import com.xiangyin.mapper.EmployeeMapper;
import com.xiangyin.pojo.Employee;
import com.xiangyin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAll() {
        return employeeMapper.queryList();
    }
}
