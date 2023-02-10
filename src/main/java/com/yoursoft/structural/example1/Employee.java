package com.yoursoft.structural.example1;

import java.util.Date;

public class Employee {

    private String name;
    private Date birthday;
    private String identityNumber;

    public Employee(String name, Date birthday, String identityNumber) {
        this.name = name;
        this.birthday = birthday;
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", birthday=" + birthday + ", identityNumber='" + identityNumber + '\'' + '}';
    }
}
