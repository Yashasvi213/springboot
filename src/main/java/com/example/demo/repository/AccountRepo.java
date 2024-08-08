package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Account;

public interface AccountRepo extends MongoRepository<Account, Integer> {

}
