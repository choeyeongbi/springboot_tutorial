package com.example.testdemo.task;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection=TaskProjection.class, collectionResourceRel = "tasks" ,path = "tasks")
public interface TaskRepository extends PagingAndSortingRepository<Task,Long> {

    List<Task> findTaskById(@Param("id") Long id);
}
