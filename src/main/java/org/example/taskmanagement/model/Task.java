package org.example.taskmanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;      // e.g. "PENDING", "IN_PROGRESS", "COMPLETED"
    private String priority;    // e.g. "LOW", "MEDIUM", "HIGH"

    // Relationship with User (e.g., each task belongs to a user)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}