package com.dennysmorillo.todo_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TaskRequestDTO {

    @NotBlank(message = "The title cannot be empty")
    @Size(min = 3, max = 100, message = "The title must be between 3 and 100 characters")
    private String title;


    @Size(max = 255, message = "The description cannot be longer than 255 characters")
    private String description;

    private Boolean completed;
}
