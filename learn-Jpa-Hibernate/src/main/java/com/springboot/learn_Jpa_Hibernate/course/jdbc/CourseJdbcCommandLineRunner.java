package com.springboot.learn_Jpa_Hibernate.course.jdbc;

import com.springboot.learn_Jpa_Hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepo repository;

    @Override
    public void run(String... args) throws Exception {
        // When we want to implement some log at the start of the application, we can
        // use command line runner.
        repository.insert(new Course(1, "Learn Spring Boot", "28min"));
        repository.insert(new Course(2, "Learn AWS", "Stephane"));
        repository.insert(new Course(3, "Hidden Love", "Zhao Lu si"));

        repository.delete(2);

        System.out.println(repository.findById(3));
        System.out.println(repository.findById(1));
    }
}
