package com.example.crudtodolist.controller;

import com.example.crudtodolist.model.ToDoItem;
import com.example.crudtodolist.service.ToDoListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toDoList")
public class Controller {

    @Autowired
    protected ToDoListServiceImpl toDoListService;

    @PostMapping("/create")
    public void create(@RequestBody ToDoItem toDoItem){
        toDoListService.create(toDoItem);
    }

    @GetMapping("/read")
    public List<ToDoItem> read(){
       return toDoListService.read();
    }

    @PutMapping("/update")
    public ToDoItem update(@RequestBody ToDoItem toDoItem){
        return toDoListService.update(toDoItem);
    }

    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable long id){
        toDoListService.delete(id);
    }

}
