package com.jsp.PWApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.PWApp.dao.AccountDao;
import com.jsp.PWApp.dto.Account;
import com.jsp.PWApp.dto.User;

import jakarta.servlet.http.HttpSession;

@Service
public class AccountService {
	@Autowired
	AccountDao dao;

	public Account saveAccount(Account account, HttpSession session) {

		if (account != null && session != null) {
			User user = (User) session.getAttribute("user");
			account.setAmount(account.getInitalAmount());
			account.setUser(user);
			Account account2 = dao.saveAccount(account);
			if (account2 != null) {
				session.setAttribute("account", account2);
				return dao.saveAccount(account2);
			}
		}
		return null;
	}

	public Account updateAccount(Account account, HttpSession session) {
		if (account != null && session != null) {
			User user = (User) session.getAttribute("user2");
			account.setUser(user);
			return dao.updateAccount(account);
		}
		return null;

	}

	public List<Account> getAllAccount() {
		return dao.getAllAccount();
	}

	public Account getAccountById(int id) {
		return dao.getAccountById(id);
	}

	public Account deleteAccount(int id) {
		return dao.deleteAccount(id);
	}

	public Account sendAmount(double amt, HttpSession session) {
		if (amt > 0) {
			Account account = (Account) session.getAttribute("account");
			if (account != null) {
				double res = account.getAmount() - amt;
				if (res > amt) {
					account.setAmount(res);
					return dao.updateAccount(account);
				}
			}
		}
		return null;
	}

	public Account receiveAmount(double amt, HttpSession session) {
		if (amt > 0) {
			//System.out.println("for checking");
			Account account = (Account) session.getAttribute("account");
			if (account != null) {
				//System.out.println("for checking condition");
				double res = account.getAmount() + amt;
				
					//System.out.println("for checking condition working");
					account.setAmount(res);
					return dao.updateAccount(account);
				
			}
		}
		return null;

	}
	public Account checkBalance(HttpSession session) {
		Account account=(Account) session.getAttribute("account");
		if(account!=null) {
			return dao.getAccountById(account.getId());
		}
		return null;
		
	}

}
