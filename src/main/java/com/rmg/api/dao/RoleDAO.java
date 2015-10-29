package com.rmg.api.dao;

import java.util.List;

import com.rmg.api.domain.Role;

public interface RoleDAO {

	void addRole(Role role);
	Role  getRole(String roleId);
	List<Role> getRoles();
}
