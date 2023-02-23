package com.yoursoft.structural.composite;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Developer("Juan", 10);
        Employee employee2 = new Developer("Manuel", 11);
        Employee employee3 = new Developer("Baracaldo", 12);

        Employee manager = new Manager("Marín", 1);


        CompanyDetails companyDetails = new CompanyDetails("Yoursoft");
        companyDetails.addEmployee(manager);
        companyDetails.addEmployee(employee1);
        companyDetails.addEmployee(employee2);
        companyDetails.addEmployee(employee3);

        companyDetails.printEmployeeDetails();
    }
}
