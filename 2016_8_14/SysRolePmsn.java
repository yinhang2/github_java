package com.lzu.LzuOl.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lzu.LzuOl.entity.SysPmsn;

/**
 * <p>Title: SysRolePmsn</p>
 * <p>Description: 角色权限实体表</p>
 * <p>Company:@LZU By Author </p>
 *
 * @author J.Q.Wang [wjq_z@qq.com]
 * @date 2016-8-8 下午10:18:55
 * @version 1.0.0
 */
@Entity
@Table(name = "sys_role_pmsn", catalog = "lzuol")
public class SysRolePmsn implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer numId;
	private String roleId;
	private String pmsnId;
	private List<SysPmsn> sysPmslist;


	// Constructors

	/** default constructor */
	public SysRolePmsn() {
	}

	/** full constructor */
	public SysRolePmsn(String roleId, String pmsnId) {
		this.roleId = roleId;
		this.pmsnId = pmsnId;
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

	@Column(name = "role_id", nullable = false, length = 8)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "pmsn_id", nullable = false, length = 8)
	public String getPmsnId() {
		return this.pmsnId;
	}

	public void setPmsnId(String pmsnId) {
		this.pmsnId = pmsnId;
	}
	
	public List<SysPmsn> getSysPmslist() {
		return sysPmslist;
	}
	public void setSysPmslist(List<SysPmsn> sysPmslist) {
		this.sysPmslist = sysPmslist;
	}

}