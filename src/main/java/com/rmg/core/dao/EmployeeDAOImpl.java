package com.rmg.core.dao;

import com.rmg.api.dao.EmployeeDAO;
import com.rmg.api.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	EmployeeDAOImpl()
	{
		System.out.println("UserDAOImpl");
	}
	public boolean checkLogin(Employee user) {
		return false;
	}

}
