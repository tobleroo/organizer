package com.tjdev.organizer.todoBis.service;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.model.Task;
import com.tjdev.organizer.model.TaskCategories;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {


    private List<Task> taskListOne = List.of(new Task("actOne"), new Task("actTwo"));
    private List<Task> taskListTwo = List.of(new Task("secondActOne"), new Task("secondActTwo"));
    private TaskCategories taskCategoriesOne = new TaskCategories("taskListOne");
    private TaskCategories taskCategoriesTwo = new TaskCategories("taskListTwo");
    private MyUser demoUser = new MyUser("user", "password");



    @Test
    void addActivityList() {

    }

    @Test
    void addTaskToList() {
    }

    @Test
    void retrieveAllTasks(){

        taskCategoriesOne.setListOfTasks(taskListOne);
        taskCategoriesTwo.setListOfTasks(taskListTwo);

        demoUser.setTaskCategories(List.of(taskCategoriesOne, taskCategoriesTwo));

        System.out.println(demoUser.getTaskCategories());
    }

    @Test
    void retrieveUser() {
    }
}