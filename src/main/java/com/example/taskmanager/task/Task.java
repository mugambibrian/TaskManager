package com.example.taskmanager.task;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
@Table(name = "task")
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="status name is required")
    @Column(name="title")
    private String title;

    @NotEmpty(message="status name is required")
    @Column(name="description")
    private String description;

    @NotNull
    @Column(name="dueDate")
    private Date dueDate;

    // Constructors, getters, setters
}