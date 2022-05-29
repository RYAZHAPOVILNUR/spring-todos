package com.example.demo.todo;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class CreateTodoRequest {
    @NotBlank(message = "can't be empty")
    private String title;
    @NotBlank(message = "can't be empty")
    private String description;
    private boolean done;
}
