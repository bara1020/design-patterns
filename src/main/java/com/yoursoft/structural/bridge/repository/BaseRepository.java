package com.yoursoft.structural.bridge.repository;

import com.yoursoft.structural.bridge.BaseEntity;
import com.yoursoft.structural.bridge.Employee;

public interface BaseRepository {
    public Employee save(Employee employee);
    public StorageRepository getRepository();
}
