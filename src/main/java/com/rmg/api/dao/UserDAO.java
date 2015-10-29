package com.rmg.api.dao;

import com.rmg.api.domain.Employee;

public interface UserDAO {

	public boolean checkLogin(Employee user);
}
