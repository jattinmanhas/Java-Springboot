package com.springBootProject.FirstWebApp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "jattin_manhas","Learn AWS1",
                LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(++todosCount, "jattin_manhas","Learn DevOps1",
                LocalDate.now().plusYears(2), false ));
        todos.add(new Todo(++todosCount, "jattin_manhas","Learn Full Stack Development1",
                LocalDate.now().plusYears(3), false ));
    }

    public List<Todo> findByUsername(String username){
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isItDone){
        Todo todo = new Todo(++todosCount, username, description, targetDate, isItDone);
        todos.add(todo);
    }

    public void deleteById(int id){
        // todo.getId() == id -> remove todo
        // todo -> todo.getId() == id
        Predicate<? super Todo> predicate = todo -> todo.getId() == id ;
        todos.removeIf(predicate);
    }

    public Todo findById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
