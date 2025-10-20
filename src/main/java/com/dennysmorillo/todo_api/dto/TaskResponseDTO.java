package com.dennysmorillo.todo_api.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
public class TaskResponseDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private Boolean completed;
}
