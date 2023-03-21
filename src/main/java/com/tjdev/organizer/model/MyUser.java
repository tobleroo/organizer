package com.tjdev.organizer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("userdata")
public class MyUser {

    @Id
    private String id;

    private List<TaskCategories> taskCategories;

    private String username;
    private String password;

    private String roles;

    public MyUser(String username, String password){
        this.username = username;
        this.password = password;
        this.roles = "admin";
        this.taskCategories = new ArrayList<>();
        this.taskCategories.add(new TaskCategories("unnamed"));
    }

//    public MyUser() {
//        this.taskCategories = new ArrayList<>();
//    }

    public List<TaskCategories> getTaskCategories() {
        return taskCategories;
    }

    public void setTaskCategories(List<TaskCategories> taskCategories) {
        this.taskCategories = taskCategories;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", taskCategories=" + taskCategories +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
