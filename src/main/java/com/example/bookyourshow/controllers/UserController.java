package com.example.bookyourshow.controllers;

import com.example.bookyourshow.dto.CreateUserDTO;
import com.example.bookyourshow.dto.UpdateUserDTO;
import com.example.bookyourshow.models.User;
import com.example.bookyourshow.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody CreateUserDTO request){
        if (request.getEmail() == null) throw new RuntimeException("Invalid Email");
        System.out.println("Creating User... " + request);
        return null;
    }
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable String id, @RequestBody UpdateUserDTO request){
        System.out.println("Updating User... " + request);
        return null;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){
        return null;
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return null;
    }
}
