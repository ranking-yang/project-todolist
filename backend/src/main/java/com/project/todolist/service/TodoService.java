package com.project.todolist.service;

import java.util.List;

import com.project.todolist.entity.Todo;

public interface TodoService {

    public void insertTodo(Todo todo);

    public void updateTodo(Todo todo);

    public void deleteTodo(Long id);

    public List<Todo> getTodoList ();
}
