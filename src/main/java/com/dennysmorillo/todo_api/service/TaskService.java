package com.dennysmorillo.todo_api.service;

import com.dennysmorillo.todo_api.model.Task;
import com.dennysmorillo.todo_api.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepo;

    // POST:: CREATE
    public Task createTask(Task task){
        task.setCreatedAt(LocalDateTime.now());
        task.setCompleted(false);
        return taskRepo.save(task);
    }

    // GET::
    // Get all
    public List<Task> getAllTask(){
        return taskRepo.findAll();
    }

    // Get by id
    public Optional<Task> getTaskById(Long id){
        return taskRepo.findById(id);
    }


    // PUT::
    public Task updateTask(Long id, Task taskDetails){
        // if the task exists
        Task task = taskRepo.findById(id)
                .orElseThrow( () -> new RuntimeException("task not found with id: " + id));

        // Update fields
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.getCompleted());
        // we don't need to update the createdAt

        return taskRepo.save(task);
    }

    // DELETE::
    public void deleteTask(Long id){
        // find the task to know if exists
        Task task = taskRepo.findById(id)
                .orElseThrow( () -> new RuntimeException("Task not found with id: " + id));

        taskRepo.delete(task);
    }

}
