package com.yoursoft.structural.bridge.repository;

import com.yoursoft.structural.bridge.BaseEntity;

public class DataBaseRepository implements StorageRepository{
    @Override
    public void save(BaseEntity entity) {
        System.out.println("Registry saved correctly in the DB!");
    }
}
