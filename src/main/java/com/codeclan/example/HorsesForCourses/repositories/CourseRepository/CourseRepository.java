package com.codeclan.example.HorsesForCourses.repositories.CourseRepository;

import com.codeclan.example.HorsesForCourses.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    public List<Course> getCourseByRating(int rating);
    public List<Course> getCoursesForCustomer(Long id);
}
