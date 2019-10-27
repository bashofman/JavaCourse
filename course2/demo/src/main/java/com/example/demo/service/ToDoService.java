package com.example.demo.service;

import com.example.demo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoService extends CrudRepository<ToDo, Integer> {


}
