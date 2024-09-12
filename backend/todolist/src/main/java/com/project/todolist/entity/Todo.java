package com.project.todolist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "todos")
@Data
public class Todo {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "text", length = 255)
    private String text;

    @Column(name = "done", nullable = false)
    private boolean done;

    @Builder
    public Todo(int id, String text, boolean done) {
        this.id = id;
        this.text = text;
        this.done = done;
    }
}
