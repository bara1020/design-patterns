package com.yoursoft.structural.adapter;

import com.yoursoft.structural.adapter.example1.Employee;
import com.yoursoft.structural.adapter.example1.Student;

public class EmployeeAdapter {

    public static Employee getEmployee(Student student){
        return  new Employee(student.getName(), student.getBornDate(), student.getNit());
    }
}
