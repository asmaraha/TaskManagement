package org.example.taskmanagement.service;
import org.example.taskmanagement.dto.RegisterRequest;
import org.example.taskmanagement.model.User;

public interface UserService {
    User register(RegisterRequest request);
    // Additional methods if needed
}