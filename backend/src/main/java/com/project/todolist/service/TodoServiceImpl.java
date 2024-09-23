package com.project.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.todolist.entity.Todo;
import com.project.todolist.entity.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public void insertTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        Todo savedTodo = todoRepository.findById(todo.getId()).get();
        savedTodo.setDone(todo.isDone());
        todoRepository.save(savedTodo);
    }

    @Override
    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}
