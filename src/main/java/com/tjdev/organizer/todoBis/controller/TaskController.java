package com.tjdev.organizer.todoBis.controller;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.todoBis.models.TaskReq;
import com.tjdev.organizer.todoBis.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/categorie")
    public String addCategorie(@RequestBody String listName, Principal principal){
        taskService.addNewTaskCategory(principal.getName(), listName);
        return "should work";
    }

    @PostMapping("/task")
    public String addTask(@RequestBody TaskReq taskReq, Principal principal){
        taskService.addNewTask(taskReq, principal.getName());
        return "should work";
    }

    @GetMapping("/see-all")
    public String seeAllActivities(Principal principal){
        MyUser user = taskService.retrieveUser(principal.getName());

//        return user.getTaskCategories().stream()
//                .flatMap(act -> act.getListOfTasks().stream())
//                .toList().toString();

//        return user.getTaskCategories().toString();
        return "currently wrong";
    }
}
