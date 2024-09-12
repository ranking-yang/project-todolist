package com.project.todolist.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.todolist.entity.Todo;

@RestController
@RequestMapping("/api")
public class TodoController {

    @PostMapping("/post")
    public void createTodo(@RequestBody Todo todo) {
        
    }

    @PutMapping("/put")
    public void updateTodo(@RequestBody Todo todo) {

    }

    @DeleteMapping("/delete")
    public void deleteTodo(@RequestBody Todo todo) {

    }

    @GetMapping("/get")
    public void getTodo(@RequestBody Todo todo) {

    }

}
