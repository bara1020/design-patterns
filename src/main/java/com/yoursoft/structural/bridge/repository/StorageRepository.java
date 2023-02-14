package com.yoursoft.structural.bridge.repository;

import com.yoursoft.structural.bridge.BaseEntity;

public interface StorageRepository {

    void save (BaseEntity entity);
}
