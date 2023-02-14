package com.yoursoft.structural.example1;

import com.yoursoft.structural.example1.adapter.EmployeeAdapter;
import com.yoursoft.structural.example1.adapter.service.EmployeeService;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setNit("123");
        student.setBornDate(new Date());

        EmployeeService employeeService = new EmployeeService();

        employeeService.saveEmployee(EmployeeAdapter.getEmployee(student));


    }
}
