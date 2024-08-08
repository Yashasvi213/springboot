package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {
	AccountRepo arepo;

	public AccountServiceImpl(AccountRepo arepo) {
		super();
		this.arepo = arepo;
	}

	@Override
	public List<Account> getall() {
		List<Account> l1=arepo.findAll();
		return l1;
	}

	@Override
	public Account getById(int id) {
		Account a=arepo.findById(id).get();
		return a;
	}

	@Override
	public String create(Account acc) {
		arepo.save(acc);
		return "success";
	}
	
}
