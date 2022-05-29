package com.example.demo.todo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/todo")
@AllArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAll();
    }

    @PostMapping()
    public Todo create(@Valid @RequestBody CreateTodoRequest todo) {
        return todoService.create(todo);
    }

}
