package com.jsp.PWApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.PWApp.dto.Login;
import com.jsp.PWApp.dto.User;
import com.jsp.PWApp.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/users")
	public List<User> getAllUser() {
		return service.getAllUser();
	}

	@GetMapping("/users/{id}")
	public User getByIdUser(@PathVariable int id) {
		return service.getByIdUser(id);
	}

	@DeleteMapping("/users/{id}")
	public User deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}

	@PutMapping("/users")
	public User updateUser(@RequestBody User user,HttpServletRequest request) {
		return service.updateUser(user,request);
	}

	@GetMapping("/users/login")
	public User validateUser(@RequestBody Login login,HttpServletRequest request) {
		return service.validateUser(login,request);
	}

}
