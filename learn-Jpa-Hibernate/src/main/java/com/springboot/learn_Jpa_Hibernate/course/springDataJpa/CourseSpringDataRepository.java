package com.springboot.learn_Jpa_Hibernate.course.springDataJpa;

import com.springboot.learn_Jpa_Hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
}
