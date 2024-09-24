package com.learnSpringBoot.learn_spring_boot;

// route: /course
// Course: id, name, author

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class courseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWs", "Stepahne"),
                new Course(2, "Learn DevOps", "Kunal")
        );
    }
}
