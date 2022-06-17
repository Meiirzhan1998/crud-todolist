package com.example.crudtodolist.service;

import com.example.crudtodolist.model.ToDoItem;

import java.util.List;

public interface IToDoListService {
    void create(ToDoItem toDoItem);

    List<ToDoItem> read();

    ToDoItem update(ToDoItem toDoItem);

    void delete(long id);
}
