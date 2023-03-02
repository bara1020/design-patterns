package com.yoursoft.behavioral.chainofresponsability;

public class PerformanceLeader extends Employee{

    @Override
    public void approveCase(String employeeName, int caseNumber)
    {
        System.out.println("Performance Leader approved " + caseNumber + " to be attended ");
    }

}
