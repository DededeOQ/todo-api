package com.dennysmorillo.todo_api.controller;

import com.dennysmorillo.todo_api.dto.TaskRequestDTO;
import com.dennysmorillo.todo_api.dto.TaskResponseDTO;
import com.dennysmorillo.todo_api.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/tasks")
@RestController
public class TaskController {

    private final TaskService taskService;

    // POST:: CREATE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TaskResponseDTO> createTask(@Valid @RequestBody TaskRequestDTO task){
        TaskResponseDTO createdTask = taskService.createTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    //GET::
    // GET ALL TASKS
    @GetMapping
    public ResponseEntity<List<TaskResponseDTO>> getAllTasks() {
        List<TaskResponseDTO> tasks = taskService.getAllTask();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    // GET::
    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> getTaskById(@PathVariable Long id) {
        TaskResponseDTO task = taskService.getTaskById(id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    // PUT::
    @PutMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> updateTask(@PathVariable Long id,@Valid @RequestBody TaskRequestDTO taskDetails) {
        TaskResponseDTO task = taskService.updateTask(id, taskDetails);
        return new ResponseEntity<>(task,HttpStatus.OK);
    }

    // DELETE::
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
