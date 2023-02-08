package com.xoriant.controller;


import com.xoriant.Service.EmployeeService;
import com.xoriant.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
      EmployeeService employeeServiceImpl;

    @PostMapping("/savedata")
    public String saveData (@RequestBody Employee employee){
        employeeServiceImpl.SaveData(employee);
        return "Data saved Successfully";
    }
    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        return  employeeServiceImpl.getAllData();
    }

    @GetMapping("/getdatabyid/{empId}")
    public Optional<Employee> getDataById(@PathVariable int empId){
        return employeeServiceImpl.getDataById(empId);
    }
    @PutMapping("/updatedatabyid/{empId}")
    public String updateDataById(@PathVariable int empId,@RequestBody Employee employee){
        employeeServiceImpl.updateDataById(empId,employee);
        return "Data updated Successfully";
    }
    @DeleteMapping("/deletedatabyid/{empId}")
    public String deleteDataById(@PathVariable int empId){
        employeeServiceImpl.deleteDataById(empId);
        return " Data deleted Suceesfully";
    }

}
