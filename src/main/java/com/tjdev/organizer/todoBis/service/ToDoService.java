package com.tjdev.organizer.todoBis.service;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.repository.UserRepository;
import com.tjdev.organizer.service.UserService;
import com.tjdev.organizer.todoBis.models.ToDoItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private final UserRepository userRepository;

    public ToDoService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<ToDoItem> retrieveTodoList(MyUser user){
        return user.getTodoList().stream()
                .sorted()
                .toList();
    }

    public void addItemToDo(ToDoItem item, MyUser user) throws Exception {

        boolean itemExists = user.getTodoList().stream()
                .anyMatch(alreadyAdded -> alreadyAdded.equals(item));

        if(!itemExists){
            user.getTodoList().add(item);
        }else {
            throw new Exception("item already exists!");
        }

    }

    public String deleteItemToDo(ToDoItem item, MyUser user){

        boolean exists = user.getTodoList().stream()
                .anyMatch(itemsInList -> itemsInList.equals(item));

        if(exists){
            user.getTodoList().remove(item);
            return "item deleted from todo list";
        }else{
            return "item did not exist in list";
        }
    }
}
