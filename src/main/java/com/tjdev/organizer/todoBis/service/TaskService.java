package com.tjdev.organizer.todoBis.service;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.model.Task;
import com.tjdev.organizer.model.TaskCategories;
import com.tjdev.organizer.repository.UserRepository;
import com.tjdev.organizer.todoBis.models.TaskReq;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final UserRepository userRepository;


    public TaskService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addActivityList(String listName, String username){
        MyUser user = userRepository.findByUsername(username).get();

        List<TaskCategories> taskList = user.getTaskCategories();
        taskList.add(new TaskCategories(listName));

        userRepository.save(user);
    }

    public void addTaskToList(String userName, TaskReq task){
        MyUser user = userRepository.findByUsername(userName).get();

        for(TaskCategories categorie : user.getTaskCategories()){
            if(Objects.equals(categorie.getTaskCategoryName(), task.list())){
                List<Task> tasks = categorie.getListOfTasks();
                tasks.add(new Task(task.taskName()));
                categorie.setListOfTasks(tasks);
            }
        }
        userRepository.save(user);
    }

    public List<TaskCategories> retrieveAllTasks(MyUser user){
        return user.getTaskCategories().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public MyUser retrieveUser(String username){
        return userRepository.findByUsername(username).get();
    }
}
