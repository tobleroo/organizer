package com.tjdev.organizer.service;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }






}
