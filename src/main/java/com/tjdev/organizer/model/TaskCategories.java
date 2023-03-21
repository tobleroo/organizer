package com.tjdev.organizer.model;

import java.util.ArrayList;
import java.util.List;

public class TaskCategories {

    private String taskCategoryName;

    private List<Task> listOfTasks;

    public TaskCategories(String taskCategoryName) {
        this.taskCategoryName = taskCategoryName;
        listOfTasks = new ArrayList<>();
    }

    public TaskCategories(){
        listOfTasks = new ArrayList<>();
    }

    public String getTaskCategoryName() {
        return taskCategoryName;
    }

    public void setTaskCategoryName(String taskCategoryName) {
        this.taskCategoryName = taskCategoryName;
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
                "taskCategory='" + taskCategoryName + '\'' +
                ", listOfTasks=" + listOfTasks +
                '}';
    }
}
