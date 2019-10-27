package com.example.demo.controller;


import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ToDoController {

    @Autowired
    ToDoService todoService;

    @GetMapping("/hello")
    String sayHello() {
        return "hello, world";
    }

    @GetMapping("/todo")
    Iterable <ToDo> getTodo() {
        return todoService.findAll();
    }

    @PostMapping("/todo")
    void recieveToDo(@RequestBody ToDo todo){
        todoService.save(todo);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/todo/{id}")
    void delete(@PathVariable int id){
        todoService.deleteById(id);
    }

    @GetMapping("/todo/{id}")
    public Optional<ToDo> todoById(@PathVariable  int id) {
        return todoService.findById(id);
    }

}
