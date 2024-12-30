package org.example.taskmanagement.service;
import org.example.taskmanagement.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task, String username);
    Task updateTask(Long taskId, Task task, String username);
    void deleteTask(Long taskId, String username);
    List<Task> getUserTasks(String username);
    Task getTaskById(Long taskId, String username);
}
