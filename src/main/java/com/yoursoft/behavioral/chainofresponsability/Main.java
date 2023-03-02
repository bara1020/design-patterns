package com.yoursoft.behavioral.chainofresponsability;

public class Main {

    private static String EMPLOYEE_NAME = "Juan Manuel";
    private static int CASE_NUMBER = 12345;

    public static void main(String[] args) {

        FunctionalLeader functionalLeader = new FunctionalLeader();
        TechnicalLeader technicalLeader = new TechnicalLeader();
        PerformanceLeader performanceLeader = new PerformanceLeader();

        functionalLeader.approveCase(EMPLOYEE_NAME, CASE_NUMBER);

        functionalLeader.setNextApproving(technicalLeader);

        technicalLeader.approveCase(EMPLOYEE_NAME, CASE_NUMBER);

        technicalLeader.setNextApproving(performanceLeader);

        performanceLeader.approveCase(EMPLOYEE_NAME, CASE_NUMBER);

        System.out.println("Case number " + CASE_NUMBER + " was approved");


    }
}
