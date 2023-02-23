package com.yoursoft.structural.composite;

public class Manager extends Employee{
    protected String name;
    protected long empID;
    protected String designation;

    public Manager(String name, long empID)
    {
        this.name = name;
        this.empID = empID;
    }
    @Override
    public void printEmployeeDetails()
    {
        System.out.println("Name:" + name + " empID:" + empID + " Designation:Manager");
    }

}
