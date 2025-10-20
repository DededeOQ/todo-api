package com.dennysmorillo.todo_api.controller;

import com.dennysmorillo.todo_api.model.Task;
import com.dennysmorillo.todo_api.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    // POST:: CREATE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    //GET::
    // GET ALL TASKS
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTask();
    }

    // GET::
    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id)
                .map(ResponseEntity::ok) // Si la encuentra, devuelve 200 OK
                .orElse(ResponseEntity.notFound().build()); // Si no, devuelve 404 Not Found
    }

    // PUT::
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        try {
            Task updatedTask = taskService.updateTask(id, taskDetails);
            return ResponseEntity.ok(updatedTask);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE::
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        try {
            taskService.deleteTask(id);
            return ResponseEntity.noContent().build(); // Devuelve 204 No Content (éxito)
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
