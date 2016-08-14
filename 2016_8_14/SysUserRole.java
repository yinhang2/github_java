package com.lzu.LzuOl.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lzu.LzuOl.entity.SysRole;

/**
 * <p>Title: SysUserRole</p>
 * <p>Description: 用户角色实体</p>
 * <p>Company:@LZU By Author </p>
 *
 * @author J.Q.Wang [wjq_z@qq.com]
 * @date 2016-8-8 下午10:19:35
 * @version 1.0.0
 */
@Entity
@Table(name = "sys_user_role", catalog = "lzuol")
public class SysUserRole implements java.io.Serializable {

	
	// Fields
	private static final long serialVersionUID = 1L;
	private Integer numId;
	private String userId;
	private String roleId;
	private List<SysRole> roleList;
	// Constructors

	/** default constructor */
	public SysUserRole() {
	}

	/** full constructor */
	public SysUserRole(String userId, String roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "num_id", unique = true, nullable = false, length = 5)
	public Integer getNumId() {
		return this.numId;
	}

	public void setNumId(Integer numId) {
		this.numId = numId;
	}

	@Column(name = "user_id", nullable = false, length = 20)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "role_id", nullable = false, length = 8)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public List<SysRole> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<SysRole> roleList) {
		this.roleList = roleList;
	}	
}