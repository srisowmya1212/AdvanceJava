package com.jsp.PWApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.PWApp.dto.Account;
import com.jsp.PWApp.service.AccountService;

import jakarta.servlet.http.HttpSession;

@RestController
public class AccountController {
	@Autowired
	AccountService service;
     @PostMapping("/accounts")
	public Account saveAccount(@RequestBody Account account,HttpSession session) {
		return service.saveAccount(account,session);
	}
     @PutMapping("/accounts")
	public Account updateAccount(@RequestBody Account account,HttpSession session) {
		return service.updateAccount(account,session);
	}
    @GetMapping("/accounts")
	public List<Account> getAllAccount() {
		return service.getAllAccount();
	}
    @GetMapping("/accounts/{id}")
	public Account getAccountById(@PathVariable int id) {
		return service.getAccountById(id);
	}
    @DeleteMapping("/accounts/{id}")
	public Account deleteAccount(@PathVariable int id) {
		return service.deleteAccount(id);
	}
    @PatchMapping("/accounts/{amt}")
    public Account sendAmount(@PathVariable double amt,HttpSession session) {
    	return service.sendAmount(amt, session);
    }
    @PatchMapping("/accounts")
    public Account receiveAmount(@RequestParam double amt,HttpSession session) {//it makes duplicate url so take request param url rewriting
    	return service.receiveAmount(amt, session);
    }
    @GetMapping("/accounts/checkbalance")
    public Account checkBalance(HttpSession session) {
    	return service.checkBalance(session);
    }

}
