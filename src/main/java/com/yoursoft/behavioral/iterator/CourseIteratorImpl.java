package com.yoursoft.behavioral.iterator;

import com.yoursoft.behavioral.iterator.model.Course;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {

        private CourseCategoryEnum category;
        private List<Course> coursesList;
        private int position;

        public CourseIteratorImpl(CourseCategoryEnum category,
                List<Course> coursesList) {
            this.category = category;
            this.coursesList = coursesList;
        }

        @Override
        public boolean hasNext() {
            while (position < coursesList.size()) {
                Course course = coursesList.get(position);
                if (course.getCategory().equals(category) || category.equals(CourseCategoryEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Course next() {
            Course c = coursesList.get(position);
            position++;
            return c;
        }

    private class ChannelIteratorImpl {
    }
}
