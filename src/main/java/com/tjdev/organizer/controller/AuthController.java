package com.tjdev.organizer.controller;


import com.tjdev.organizer.service.TokenService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    private static final Logger log = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;


    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(Authentication authentication){
        log.debug("token req for user");
        String token = tokenService.generateToken(authentication);

        return token;
    }
}
