package org.example.taskmanagement.repository;

import org.example.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Retrieve tasks by user id
    List<Task> findByUserId(Long userId);

    // You can add custom queries for filtering or sorting if needed
}