package com.example.testdemo.task;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "tasks")
public class Task {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long id;

    private String text;
    private String date;
    private Boolean reminder;
}
