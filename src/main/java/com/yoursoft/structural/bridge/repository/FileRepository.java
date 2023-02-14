package com.yoursoft.structural.bridge.repository;

import com.yoursoft.structural.bridge.BaseEntity;

public class FileRepository implements StorageRepository{
    @Override
    public void save(BaseEntity entity) {
        System.out.println("File saved correctly in the filesystem!");
    }
}
