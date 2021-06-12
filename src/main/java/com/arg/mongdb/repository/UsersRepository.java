package com.arg.mongdb.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arg.mongdb.entity.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, Integer> {

}
