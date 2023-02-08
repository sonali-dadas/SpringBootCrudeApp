package com.xoriant.dao;


import com.xoriant.model.Employee;
import com.xoriant.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl  implements EmployeeDao{

    @Autowired
    EmployeeRepo employeeRepoImpl;
    @Override
    public Employee SaveData(Employee employee) {

        return employeeRepoImpl.save(employee);
    }

    @Override
    public List<Employee> getAllData() {
        return employeeRepoImpl.findAll();
    }

    @Override
    public Optional<Employee> getDataById(int empId) {
        return employeeRepoImpl.findById(empId);
    }

    @Override
    public Employee updateDataById(int empId, Employee employee) {
        return employeeRepoImpl.save(employee);
    }

    @Override
    public void deleteDataById(int empId) {
        employeeRepoImpl.deleteById(empId);
    }
}
