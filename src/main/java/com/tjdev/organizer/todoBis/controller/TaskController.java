package com.tjdev.organizer.todoBis.controller;

import com.tjdev.organizer.todoBis.models.TaskReq;
import com.tjdev.organizer.todoBis.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/categorie")
    public String addCategorie(@RequestBody String listName, Principal principal){
        taskService.addActivityList(listName, principal.getName());
        return "should work";
    }

    @PostMapping("/task")
    public String addTask(@RequestBody TaskReq taskReq, Principal principal){
        taskService.addTaskToList(principal.getName(), taskReq);
        return "should work";
    }
}
