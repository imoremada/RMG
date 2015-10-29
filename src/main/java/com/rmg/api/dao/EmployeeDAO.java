package com.rmg.api.dao;

import com.rmg.api.domain.Employee;

public interface EmployeeDAO {

	public boolean checkLogin(Employee user);
}
