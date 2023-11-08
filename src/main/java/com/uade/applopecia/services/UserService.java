package com.uade.applopecia.services;

import com.uade.applopecia.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {

    @GetMapping("/GetUserById")
    public User getUserById(@RequestParam("id") String id){
        return User.builder().username("icesarani").build();
    }

}
