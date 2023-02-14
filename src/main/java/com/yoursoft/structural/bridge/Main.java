package com.yoursoft.structural.bridge;

import com.yoursoft.structural.bridge.repository.DataBaseRepository;
import com.yoursoft.structural.bridge.repository.EmployeeRepository;
import com.yoursoft.structural.bridge.repository.FileRepository;

public class Main {

    public static void main(String[] args) {


        EmployeeRepository fileRepositroy = new EmployeeRepository (new FileRepository());
        fileRepositroy.save(new Employee() );

        // code to store in DataBase
        EmployeeRepository dbRepositroy = new EmployeeRepository(new DataBaseRepository());
        dbRepositroy.save(new Employee() );
    }
}
