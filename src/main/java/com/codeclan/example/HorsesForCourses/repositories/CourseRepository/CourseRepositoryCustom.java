package com.codeclan.example.HorsesForCourses.repositories.CourseRepository;

import com.codeclan.example.HorsesForCourses.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    public List<Course> getCourseByRating(int rating);
}
