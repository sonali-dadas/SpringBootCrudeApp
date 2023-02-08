package com.xoriant.Service;


import com.xoriant.dao.EmployeeDao;
import com.xoriant.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

    @Autowired
    EmployeeDao employeeDaoImpl;

    @Override
    public Employee SaveData(Employee employee) {
        return employeeDaoImpl.SaveData(employee);
    }

    @Override
    public List<Employee> getAllData() {
        return employeeDaoImpl.getAllData();
    }

    @Override
    public Optional<Employee> getDataById(int empId) {
        return  employeeDaoImpl.getDataById(empId);
    }

    @Override
    public Employee updateDataById(int empId, Employee employee) {
        return  employeeDaoImpl.updateDataById(empId,employee);
    }

    @Override
    public void deleteDataById(int empId) {
        employeeDaoImpl.deleteDataById(empId);
    }
}
