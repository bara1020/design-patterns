package com.yoursoft.behavioral.iterator;

import com.yoursoft.behavioral.iterator.model.Course;

public interface CourseCollection {

    public void addCourse(Course course);

    public void removeCourse(Course course);

    public CourseIterator iterator(CourseCategoryEnum category);
}
