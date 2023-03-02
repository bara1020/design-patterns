package com.yoursoft.behavioral.chainofresponsability;

public class FunctionalLeader extends Employee{

    @Override
    public void approveCase(String employeeName, int caseNumber)
    {
        System.out.println("Functional Leader approved " + caseNumber + " to be attended ");
    }

}
