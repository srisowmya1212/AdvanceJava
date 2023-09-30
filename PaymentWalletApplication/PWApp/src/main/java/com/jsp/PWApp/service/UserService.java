package com.jsp.PWApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.PWApp.dao.UserDao;
import com.jsp.PWApp.dto.Login;
import com.jsp.PWApp.dto.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class UserService {
	@Autowired
	UserDao dao;

	public User saveUser(User user) {
		return dao.saveUser(user);

	}

	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	public User getByIdUser(int id) {
		return dao.getByIdUser(id);
	}

	public User deleteUser(int id) {
		return dao.deleteUser(id);
	}

	public User updateUser(User user,HttpServletRequest request) {
		HttpSession session=request.getSession();
		User user2=dao.updateUser(user);
		if(user2!=null) {
			session.setAttribute("user2", user2);
		}
		return user2;
	}

	public User validateUser(Login login, HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = dao.validateUser(login);
		if (user != null) {
             session.setAttribute("user", user);
		}
		return user;
	}

}
