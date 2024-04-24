package com.igorkorolev.spring.sprigboot.springboot_rest1.dao;

import com.igorkorolev.spring.sprigboot.springboot_rest1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public  void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
