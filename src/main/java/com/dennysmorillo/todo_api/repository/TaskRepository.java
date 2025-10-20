package com.dennysmorillo.todo_api.repository;

import com.dennysmorillo.todo_api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
