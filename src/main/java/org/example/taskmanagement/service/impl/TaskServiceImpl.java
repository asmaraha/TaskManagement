package org.example.taskmanagement.service.impl;

import org.example.taskmanagement.model.Task;
import org.example.taskmanagement.model.User;
import org.example.taskmanagement.repository.TaskRepository;
import org.example.taskmanagement.repository.UserRepository;
import org.example.taskmanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Task createTask(Task task, String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        task.setUser(user);
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long taskId, Task updatedTask, String username) {
        Task existingTask = getTaskById(taskId, username);
        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setStatus(updatedTask.getStatus());
        existingTask.setPriority(updatedTask.getPriority());
        return taskRepository.save(existingTask);
    }

    @Override
    public void deleteTask(Long taskId, String username) {
        Task existingTask = getTaskById(taskId, username);
        taskRepository.delete(existingTask);
    }

    @Override
    public List<Task> getUserTasks(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return taskRepository.findByUserId(user.getId());
    }

    @Override
    public Task getTaskById(Long taskId, String username) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        if (!task.getUser().getUsername().equals(username)) {
            throw new RuntimeException("Access denied");
        }
        return task;
    }
}
