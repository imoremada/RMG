package com.rmg.core.dao;

import com.rmg.api.dao.UserDAO;
import com.rmg.api.domain.Employee;

public class UserDAOImpl implements UserDAO{

	UserDAOImpl()
	{
		System.out.println("UserDAOImpl");
	}
	public boolean checkLogin(Employee user) {
		return false;
	}

}
