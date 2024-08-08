package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.AccountServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin
@RequestMapping("/account")
public class AccountController {
	AccountServiceImpl acon;

	public AccountController(AccountServiceImpl acon) {
		super();
		this.acon = acon;
	}
	@GetMapping
	public List<Account> getall(){
		
		return acon.getall();
	}
	
	@PostMapping("get/{id}")
	public Account getByid(int id) {
		return acon.getById(id);
	}
	
	@PostMapping("save")
	public String create(@RequestBody Account apt) {
		return acon.create(apt);
	}
	
	
}
