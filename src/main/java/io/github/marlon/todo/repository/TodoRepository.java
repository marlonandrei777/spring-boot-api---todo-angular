package io.github.marlon.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.marlon.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
