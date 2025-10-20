package com.dennysmorillo.todo_api.service;

import com.dennysmorillo.todo_api.dto.TaskRequestDTO;
import com.dennysmorillo.todo_api.dto.TaskResponseDTO;
import com.dennysmorillo.todo_api.exception.ResourceNotFoundException;
import com.dennysmorillo.todo_api.model.Task;
import com.dennysmorillo.todo_api.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepo;

    // POST:: CREATE
    public TaskResponseDTO createTask(TaskRequestDTO requestDTO){
       Task task = Task.builder()
               .title(requestDTO.getTitle())
               .description(requestDTO.getDescription())
               .createdAt(LocalDateTime.now())
               .completed(false)
               .build();

       Task savedTask = taskRepo.save(task);
       return convertToResponseDTO(savedTask);
    }

    // GET::
    // Get all
    public List<TaskResponseDTO> getAllTask(){
        return taskRepo.findAll()
                .stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    // Get by id
    public TaskResponseDTO getTaskById(Long id){
        Task task = taskRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id: " + id));
        return convertToResponseDTO(task);
    }


    // PUT::
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO taskDetails){
        // if the task exists
        Task task = taskRepo.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("task not found with id: " + id));

        // Update fields
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setCompleted(taskDetails.getCompleted());
        // we don't need to update the createdAt

        Task updatedTask = taskRepo.save(task);
        return convertToResponseDTO(updatedTask);
    }

    // DELETE::
    public void deleteTask(Long id){
        // find the task to know if exists
        Task task = taskRepo.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("Task not found with id: " + id));

        taskRepo.delete(task);
    }


    private TaskResponseDTO convertToResponseDTO(Task task) {
        return TaskResponseDTO.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .createdAt(task.getCreatedAt())
                .completed(task.getCompleted())
                .build();
    }
}
