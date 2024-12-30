# Task Management App Project

## Overview
A task management system allows users to manage their tasks effectively. It includes functionalities like creating, updating, deleting, and categorizing tasks. Additionally, it enables filtering tasks by status (e.g., completed, pending) and priority.

---

## Features

### Frontend
- **Responsive Design:** Built using React.js and styled with Bootstrap for a seamless user experience.
- **Interactive UI:** Includes task table (Title, Description, Status, Priority, Actions).
- **Add Task Modal:** Allows users to specify task title, description, Status, and Priority.
- **Dynamic Updates:** Tasks are dynamically rendered in the table.

### Backend
- **REST API:** Built with Spring Boot to handle task-related operations.
- **Database Integration:** Uses Hibernate and JPA for seamless database communication.
- **Task Management:** CRUD operations for tasks with real-time updates.
- **Service Layer Architecture:** Clean separation of concerns with Controller, Service, and Repository layers.

---

## Project Structure

### Backend Directory Structure (IntelliJ)
```
- src
  - main
    - java
      - org.example.taskmanagement
        - config
          - SwaggerConfig.java
        - Controller
          - TaskController.java
        - dto
          - RegisterRequest.java
        - model
          - Task.java
          - User.java
        - repository
          - TaskRepository.java
          - UserRepository.java
        - security
          - JwtUtil.java
          - SecurityConfig.java
        - service
          - impl
            - TaskServiceImpl.java
            - UserServiceImpl.java
          - TaskService.java
          - UserService.java
        - TaskManagementApplication.java
    - resources
      - application.properties
      - graphql/
      - static/
      - templates/
  - test
```

### Frontend Directory Structure (React)
```
- public
  - favicon.ico
  - index.html
  - logo192.png
  - logo512.png
  - manifest.json
  - robots.txt
- src
  - api
    - api.js
  - components
    - Footer.js
    - Header.js
    - LoginForm.js
    - RegisterForm.js
    - TaskManager.js
  - helpers
    - auth.js
  - App.css
  - App.js
  - App.test.js
  - index.css
  - index.js
  - setupTests.js
```

---

## Getting Started

### Prerequisites
- **Java 11+**
- **Node.js** (v14 or above)
- **npm** or **yarn**
- **IntelliJ IDEA**
- **React Developer Tools**

### Installation
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd TaskManagement
   ```

2. **Backend Setup:**
   - Open the project in IntelliJ IDEA.
   - Navigate to `src/main/resources/application.properties` and configure your database credentials.
   - Build and run the Spring Boot application.

3. **Frontend Setup:**
   - Navigate to the `src` folder in the terminal.
   - Install dependencies:
     ```bash
     npm install
     ```
   - Start the React development server:
     ```bash
     npm start
     ```

---

## Usage

### Add Task
1. Fill in the task Title.
2. Fill in the task Description.
3. Select the appropriate Status (Pending, In Progress, Completed).
4. Select the appropriate Priority (Low, medium, High).
5. Click the "Add Task" button above the Task List. The task will appear in the Task List.

### Manage Tasks
- **Move Task:** Drag and drop tasks between columns.
- **Delete Task:** Click the delete icon on a task card.
- **Edit Task:** Click the task card to edit details.

---

## Technologies Used

### Frontend
- React.js
- Bootstrap 5

### Backend
- Spring Boot
- Hibernate & JPA
- MySQL (or any other RDBMS)

### Development Tools
- IntelliJ IDEA
- Visual Studio Code

---

## Screenshots

### Application Interface
![Screenshot 2024-12-29 192038](https://github.com/user-attachments/assets/38153fd6-ba3a-4130-849e-d69c1e4a6ff0)

![Screenshot 2024-12-29 174556](https://github.com/user-attachments/assets/33b05810-f2de-4acf-a336-27eabd4f5b73)

![Screenshot 2024-12-29 134830](https://github.com/user-attachments/assets/6b4c3cc4-a395-4925-9dd9-859ab80f6fef)




---

## Future Enhancements
- **Drag-and-Drop Functionality:** Enhance task movement.
- **Notifications:** Implement deadline reminders.

---

## Contributors
- **[Your Name]** - Full-Stack Developer

---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments
- Thanks to the React and Spring Boot communities for their comprehensive documentation and support.

