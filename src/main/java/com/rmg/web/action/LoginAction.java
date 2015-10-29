package com.rmg.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rmg.api.dao.UserDAO;
import com.rmg.api.domain.Employee;

public class LoginAction extends ActionSupport {
	
	private Employee employee;
	private UserDAO userDAO;
	
	public String login(){
		System.out.println("here we go");
		System.out.println("User name = "+ employee.getUsername());
		return ERROR;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}