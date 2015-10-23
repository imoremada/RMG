package com.rmg.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rmg.api.dao.UserDAO;
import com.rmg.api.domain.User;

public class LoginAction extends ActionSupport {
	
	private User user;
	private UserDAO userDAO;
	LoginAction()
	{
	}
	public String check(){
		System.out.println("here we go");
		System.out.println("User name = "+ user.getUsername());
		return ERROR;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}