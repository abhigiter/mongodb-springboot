package com.arg.mongdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arg.mongdb.entity.Users;
import com.arg.mongdb.services.UsersService;

@RestController
@RequestMapping("/secure/users")
public class UsersController {
	
	@Autowired
    UsersService userService;
    
    @GetMapping("/save/")
    public Users save(@RequestBody Users user) {
    	return userService.save(user);
    }
    

    @GetMapping("/all")
    public List<Users> getAll() {
        return userService.findAll();
    }

}
