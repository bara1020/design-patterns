package com.yoursoft.behavioral.iterator.model;

import com.yoursoft.behavioral.iterator.CourseCategoryEnum;

public class Course {

    private String name;
    private CourseCategoryEnum category;
    private double duration;

    public Course(String name, CourseCategoryEnum category, double duration) {
        this.name = name;
        this.category = category;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public CourseCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CourseCategoryEnum category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Course{" + "name='" + name + '\'' + ", category=" + category + ", duration=" + duration + '}';
    }
}
