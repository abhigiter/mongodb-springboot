package com.arg.mongdb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.arg.mongdb.entity.UserContactInformation;
import com.arg.mongdb.entity.Users;
import com.arg.mongdb.repository.UsersRepository;

@RestController
public class FrontController {
	

    private UsersRepository userRepository;

    public FrontController(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping("/save/{id}/{name}")
    public Users save(@PathVariable(value="id") Integer id, @PathVariable(value="name") String name) {
    	UserContactInformation info = new UserContactInformation(1,"9405135260");
    	Users user = new Users(id, name, "MNT", 50000l, info);
    	return userRepository.save(user);
    }
    

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }

}
