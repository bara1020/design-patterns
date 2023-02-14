package com.yoursoft.structural.bridge;

import java.util.Date;

public class BaseEntity {

    private Long id;
    private Date createdDate;

    public BaseEntity() {
       this.createdDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
