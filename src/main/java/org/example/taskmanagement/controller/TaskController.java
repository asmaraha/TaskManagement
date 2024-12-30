package org.example.taskmanagement.controller;

import org.example.taskmanagement.model.Task;
import org.example.taskmanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Helper to get currently logged-in user (username)
    private String getCurrentUsername() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task, getCurrentUsername());
    }

    @GetMapping
    public List<Task> getUserTasks() {
        return taskService.getUserTasks(getCurrentUsername());
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskService.getTaskById(id, getCurrentUsername());
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task, getCurrentUsername());
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id, getCurrentUsername());
    }
}
