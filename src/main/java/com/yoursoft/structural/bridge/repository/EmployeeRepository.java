package com.yoursoft.structural.bridge.repository;

import com.yoursoft.structural.bridge.Employee;

public class EmployeeRepository implements BaseRepository{

    private StorageRepository repository;

    public EmployeeRepository(StorageRepository repository){
        this.repository=repository;
    }
    @Override
    public Employee save(Employee employee) {
        employee.setId(1L);
        repository.save(employee);
        return employee;
    }

    @Override
    public StorageRepository getRepository() {
        return repository;
    }
}
