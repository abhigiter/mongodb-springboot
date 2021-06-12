package com.arg.mongdb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.arg.mongdb.entity.Users;
import com.arg.mongdb.repository.UsersRepository;

@Service
public class UsersService {

    private UsersRepository userRepository;

    public UsersService(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

	public Users save(Users user) {
		return userRepository.save(user);
	}

	public List<Users> findAll() {
		return userRepository.findAll();
	}
}
