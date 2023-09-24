package com.xiangyin.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("employee")
public class Employee {
    private Integer empId;
    private String empName;
    private Double empSalary;
}
