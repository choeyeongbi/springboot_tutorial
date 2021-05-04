package com.example.testdemo.task;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String text;
    private String date;
    private Boolean reminder;
}
