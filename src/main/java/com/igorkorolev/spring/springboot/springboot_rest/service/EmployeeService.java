package com.igorkorolev.spring.sprigboot.springboot_rest1.service;

import com.igorkorolev.spring.sprigboot.springboot_rest1.entity.Employee;
import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
