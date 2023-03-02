package com.yoursoft.behavioral.iterator;

import com.yoursoft.behavioral.iterator.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseCollectionImpl implements CourseCollection{

    private List<Course> coursesList;

    public CourseCollectionImpl() {
        coursesList = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.coursesList.add(course);
    }

    public void removeCourse(Course course) {
        this.coursesList.remove(course);
    }

    @Override
    public CourseIterator iterator(CourseCategoryEnum category) {
        return new CourseIteratorImpl(category, this.coursesList);
    }

}
