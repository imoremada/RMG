package com.rmg.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.rmg.api.dao.RoleDAO;
import com.rmg.api.domain.Role;

public class RoleManagementAction extends ActionSupport {

	private Role role;
	private RoleDAO roleDAO;
	public String manageRole(){
		return SUCCESS;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public RoleDAO getRoleDAO() {
		return roleDAO;
	}
	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}
}
