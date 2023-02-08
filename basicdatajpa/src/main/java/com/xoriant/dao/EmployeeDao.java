package com.xoriant.dao;

import com.xoriant.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    public Employee SaveData(Employee employee);
    public List<Employee> getAllData();
    public Optional<Employee> getDataById(int empId);
    public Employee updateDataById(int empId,Employee employee);
    public void deleteDataById(int empId);
}
