package com.rmg.api.domain;

import java.io.Serializable;
import java.util.BitSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Role implements Serializable{
	 /**
	 * @author imoremada
	 */
	/** The System Administrator */
    public static final String ROLE_ADMIN = "ADMIN";
    /** Normal User */
    public static final String ROLE_OPERATOR= "OPERATOR";
    
    @Id
    private String roleId;
	@Transient
    /** The permission BitSet used at runtime - loaded from the permissions byte[] */
    private BitSet permBitSet;
    public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public BitSet getPermBitSet() {
		return permBitSet;
	}
	public void setPermBitSet(BitSet permBitSet) {
		this.permBitSet = permBitSet;
	}
}