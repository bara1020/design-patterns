package com.yoursoft.structural.composite;

public class CompanyDetails  extends CompanyDirectory{

    private String companyName;

    public CompanyDetails(String companyName)
    {
        this.companyName=companyName;
    }

    public void showCompanyName()
    {
        System.out.println(this.companyName);
    }
}
