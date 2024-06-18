# Task Management System

## Description
Develop a simple system for managing a list of tasks. The system should allow adding, searching, updating, deleting, and listing tasks. Additionally, it should support marking tasks as completed and identifying overdue tasks based on the current date.

## Requirements

### Classes and Methods:
- **Task Class**:
    - Attributes: `id`, `title`, `description`, `dueDate`, `isCompleted`
    - Methods: getters and setters for all attributes

- **TaskManager Class**:
    - Methods:
        - `addTask`: Add a new task to the list.
        - `findTaskById`: Retrieve a task based on its ID.
        - `updateTask`: Update information for an existing task.
        - `deleteTask`: Remove a task from the list based on its ID.
        - `markTaskAsCompleted`: Mark a specific task as completed.
        - `listAllTasks`: Retrieve a list of all tasks.
        - `listOverdueTasks`: Retrieve a list of tasks whose `dueDate` is before the current date.

### Functionality:
- **Add Task**: Adds a new task to the list.
- **Find Task by ID**: Retrieves a task based on its unique identifier.
- **Update Task**: Modifies the details of an existing task.
- **Delete Task**: Removes a task from the list based on its ID.
- **Mark Task as Completed**: Flags a specific task as finished.
- **List All Tasks**: Retrieves and displays all tasks currently in the system.
- **List Overdue Tasks**: Identifies and displays tasks that have passed their due date.

### Considerations:
- Utilize Java's `LocalDate` class for handling dates.
- Implement exception handling to manage scenarios such as searching for non-existent tasks.
- Ensure the implementation is modular and adheres to best coding practices.
