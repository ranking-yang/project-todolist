package com.project.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.todolist.entity.Todo;
import com.project.todolist.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/api/post")
    public Todo createTodo(@RequestBody Todo todo) {
        todoService.insertTodo(todo);
        return todo;
    }

    @PutMapping("/api/put/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        todo.setId(id);
        todoService.updateTodo(todo);
        return todo;
    }

    @DeleteMapping("/api/delete/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

    @GetMapping("/api/get")
    public List<Todo> getTodo() {
        return todoService.getTodoList();
    }

}
