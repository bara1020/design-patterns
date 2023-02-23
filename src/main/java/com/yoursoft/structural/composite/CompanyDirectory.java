package com.yoursoft.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory extends Employee{


    private List<Employee> employeeList;

    public CompanyDirectory()
    {
        employeeList = new ArrayList<>();
    }

    @Override
    public void printEmployeeDetails()
    {
        for (Employee employee : employeeList)
        {
            employee.printEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
}
