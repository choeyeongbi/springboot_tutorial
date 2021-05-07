package com.example.testdemo.task;

import org.springframework.data.rest.core.config.Projection;

@Projection(
    name = "taskProjection",
    types = { Task.class }
)
public interface TaskProjection {


    Long getId();
    String getText();
    String getDate();
    Boolean getReminder();


}
