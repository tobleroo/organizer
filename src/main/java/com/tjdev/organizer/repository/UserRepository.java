package com.tjdev.organizer.repository;

import com.tjdev.organizer.model.MyUser;
import com.tjdev.organizer.model.SecurityUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<MyUser, String> {

    Optional<MyUser> findByUsername(String name);
}
