package com.example.crudtodolist.service;

import com.example.crudtodolist.model.ToDoItem;
import com.example.crudtodolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListServiceImpl implements IToDoListService {

    @Autowired
    protected ToDoRepository repo;

    public void create(ToDoItem toDoItem) {
        repo.save(toDoItem);
    }

    public List<ToDoItem> read(){
        return repo.findAll();
    }

    public ToDoItem update(ToDoItem toDoItem){
        return repo.save(toDoItem);
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
