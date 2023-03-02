package com.yoursoft.behavioral.chainofresponsability;

public abstract class Employee
{
    protected Employee approving;
    public void setNextApproving(Employee approving)
    {
        this.approving = approving;
    }
    public abstract void approveCase(String employeeName, int caseNumber);
}