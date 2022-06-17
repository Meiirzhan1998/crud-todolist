package com.example.crudtodolist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "todolist")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoItem {
    @Id
    private Long id;
    private String title;
    private boolean done;
}
