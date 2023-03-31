package com.tjdev.organizer.todoBis.service;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.todoBis.models.ToDoItem;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoServiceTest {

    MyUser demoUser = new MyUser("demoName", "password");
    ArrayList<ToDoItem> demoItems = new ArrayList<>(List.of
            (new ToDoItem("dammsuga", "description", false),
                    new ToDoItem("moppa", "description", false)));

    ToDoServiceTest(ToDoService toDoService) {
    }

    @Test
    void retrieveTodoList() {

        demoUser.setTodoList(demoItems);

//        List<ToDoItem> returnedList = toDoService.retrieveTodoList(demoUser);
        System.out.println("returnedList");
    }

    @Test
    void addItemToDo() {
    }

    @Test
    void deleteItemToDo() {
    }
}