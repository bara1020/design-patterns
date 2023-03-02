package com.yoursoft.behavioral.iterator;

import com.yoursoft.behavioral.iterator.model.Course;

public class Main {

    public static void main(String[] args) {
        CourseCollection courses = populateChannels();
        CourseIterator baseIterator = courses.iterator(CourseCategoryEnum.ALL);

        System.out.println("__________________");
        System.out.println("Courses list");
        System.out.println("__________________");

        while (baseIterator.hasNext()) {
            Course course = baseIterator.next();
            System.out.println(course.toString());
        }


        System.out.println("__________________");
        System.out.println("Development courses list");
        System.out.println("__________________");

        CourseIterator developmentIterator = courses.iterator(CourseCategoryEnum.DVELOPMENT);
        while (developmentIterator.hasNext()) {
            Course course = developmentIterator.next();
            System.out.println(course.toString());
        }
    }

    private static CourseCollection populateChannels() {
        CourseCollection courses = new CourseCollectionImpl();
        courses.addCourse(new Course("Spring WebFlux",CourseCategoryEnum.DVELOPMENT,40.5));
        courses.addCourse(new Course("Spring",CourseCategoryEnum.DVELOPMENT,20.5));
        courses.addCourse(new Course("Java EE",CourseCategoryEnum.DVELOPMENT,40));
        courses.addCourse(new Course("Bussiness 1",CourseCategoryEnum.BUSSINESS,20));
        courses.addCourse(new Course("Bussiness 2",CourseCategoryEnum.BUSSINESS,35));
        courses.addCourse(new Course("Adobe Photoshop",CourseCategoryEnum.DESIGN,50));
        courses.addCourse(new Course("Illustrator",CourseCategoryEnum.DESIGN,25));
        courses.addCourse(new Course("Figma",CourseCategoryEnum.DESIGN,15));

        return courses;
    }
}
