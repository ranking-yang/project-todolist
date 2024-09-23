package com.project.todolist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos")
@Data
@NoArgsConstructor
public class Todo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text", length = 255)
    private String text;

    @Column(name = "done", nullable = false)
    private boolean done;

    @Builder
    public Todo(Long id, String text, boolean done) {
        this.id = id;
        this.text = text;
        this.done = done;
    }
}
