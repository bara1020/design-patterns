package com.yoursoft.behavioral.chainofresponsability;

public class TechnicalLeader extends Employee{

    @Override
    public void approveCase(String employeeName, int caseNumber)
    {
        System.out.println("Technial Leader approved " + caseNumber + " to be attended ");
    }

}
