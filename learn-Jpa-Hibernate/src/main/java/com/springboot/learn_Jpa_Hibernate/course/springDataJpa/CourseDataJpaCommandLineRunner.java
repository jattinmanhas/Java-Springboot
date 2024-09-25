package com.springboot.learn_Jpa_Hibernate.course.springDataJpa;

import com.springboot.learn_Jpa_Hibernate.course.Course;
import com.springboot.learn_Jpa_Hibernate.course.jpa.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseDataJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseSpringDataRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // When we want to implement some log at the start of the application, we can
        // use command line runner.
        repository.save(new Course(1, "Learn Spring Boot Data JPA", "28min"));
        repository.save(new Course(2, "Learn AWS Data JPA", "Stephane"));
        repository.save(new Course(3, "Hidden Love Data JPA", "Zhao Lu si"));

        repository.deleteById(2l);

        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(1l));

        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("Zhao Lu si"));

    }

}
