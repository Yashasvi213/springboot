package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Account;

public interface AccountService {
	public List<Account> getall();
	public Account getById(int id);
	public String create(Account acc);
}
