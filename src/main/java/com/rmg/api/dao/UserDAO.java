package com.rmg.api.dao;

import com.rmg.api.domain.User;

public interface UserDAO {

	public boolean checkLogin(User user);
}
