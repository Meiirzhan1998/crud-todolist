package com.example.crudtodolist.repository;

import com.example.crudtodolist.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoRepository extends JpaRepository<ToDoItem, Long> {

}
