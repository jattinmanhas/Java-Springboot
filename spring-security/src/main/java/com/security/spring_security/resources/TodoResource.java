package com.security.spring_security.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {
    private static final List<Todo> todos = List.of(new Todo("jattin_manhas", "Learn AWS"),
            new Todo("jattin_manhas", "Learn Cloud Development"));

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/todo")
    public List<Todo> retrieveAllTodos(){
        return todos;
    }

    @GetMapping("user/{username}/todo")
    public Todo retrieveTodosForSpecificUser(@PathVariable String username){
        return todos.get(0);
    }

    @PostMapping("user/{username}/todo")
    public void createTodosForSpecificUser(@PathVariable String username, @RequestBody Todo todo){
        logger.info("Create {} for {}", todo, username);
    }
}

record  Todo(String username, String description){}