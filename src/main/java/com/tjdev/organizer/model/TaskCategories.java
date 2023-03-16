package com.tjdev.organizer.model;

import java.util.ArrayList;
import java.util.List;

public class TaskCategories {

    private String taskCategory;

    private List<Task> listOfTasks;

    public TaskCategories(String taskCategory) {
        this.taskCategory = taskCategory;
        listOfTasks = new ArrayList<>();
    }

    public TaskCategories(){
        listOfTasks = new ArrayList<>();
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }

    public void setListOfTasks(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

    @Override
    public String toString() {
        return "TaskCategories{" +
                "taskCategory='" + taskCategory + '\'' +
                ", listOfTasks=" + listOfTasks +
                '}';
    }
}
