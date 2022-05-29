package com.example.demo.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    public Todo create(CreateTodoRequest todo) {
        return todoRepository.save(new Todo(
            todo.getTitle(),
            todo.getDescription(),
            todo.isDone()
        ));
    }
}
