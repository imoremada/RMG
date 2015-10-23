package com.rmg.core.dao;

import com.rmg.api.dao.UserDAO;
import com.rmg.api.domain.User;

public class UserDAOImpl implements UserDAO{

	UserDAOImpl()
	{
		System.out.println("UserDAOImpl");
	}
	public boolean checkLogin(User user) {
		return false;
	}

}
