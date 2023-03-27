package com.tjdev.organizer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Document("userdata")
public class MyUser {

    @Id
    private String id;

    private HashMap<String, List<Task>> taskCategories;

    private String username;
    private String password;

    private String roles;

    public MyUser(String username, String password){
        this.username = username;
        this.password = password;
        this.roles = "admin";
        this.taskCategories = new HashMap<>();
        ArrayList<Task> unnamedTaskList = new ArrayList<>();
        this.taskCategories.put("unnamed", unnamedTaskList );
    }

//    public MyUser() {
//        this.taskCategories = new ArrayList<>();
//    }



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

    public HashMap<String, List<Task>> getTaskCategories() {
        return taskCategories;
    }

    public void setTaskCategories(HashMap<String, List<Task>> taskCategories) {
        this.taskCategories = taskCategories;
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
