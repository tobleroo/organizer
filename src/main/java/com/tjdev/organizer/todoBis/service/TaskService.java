package com.tjdev.organizer.todoBis.service;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.todoBis.models.Task;
import com.tjdev.organizer.repository.UserRepository;
import com.tjdev.organizer.todoBis.models.TaskReq;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    private final UserRepository userRepository;


    public TaskService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void addNewTaskCategory(String username, String categoryName){
        MyUser user = userRepository.findByUsername(username).get();

        user.getTaskCategories().put(categoryName, new ArrayList<>());
        userRepository.save(user);
    }

    public void addNewTask(TaskReq requestData, String username){
        MyUser user = userRepository.findByUsername(username).get();

        user.getTaskCategories().get(requestData.list())
                .add(new Task(requestData.taskName(),
                        requestData.description(),
                        requestData.timeToDo(),
                        requestData.frequency()));

        userRepository.save(user);
    }

//    public MyUser retrieveUser(String username){
//        return userRepository.findByUsername(username).get();
//    }

}
