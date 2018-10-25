package com.codeclan.example.HorsesForCourses.repositories.CourseRepository;

import com.codeclan.example.HorsesForCourses.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
