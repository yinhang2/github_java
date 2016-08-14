package com.lzu.LzuOl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: SysRole</p>
 * <p>Description: TODO</p>
 * <p>Company:@LZU By Author </p>
 *
 * @author J.Q.Wang [wjq_z@qq.com]
 * @date 2016-8-8 下午9:57:07
 * @version 1.0.0
 */

@Entity
@Table(name="sys_role" ,catalog="lzuol")

public class SysRole  implements java.io.Serializable {


    // Fields    
	 private static final long serialVersionUID = 1L;
	 private String roleId;
     private String roleName;
     private String level;


    // Constructors

    /** default constructor */
    public SysRole() {
    }

	/** minimal constructor */
    public SysRole(String roleName) {
        this.roleName = roleName;
    }
    
    /** full constructor */
    public SysRole(String roleName, String level) {
        this.roleName = roleName;
        this.level = level;
    }

   
    // Property accessors
    @Id
    @GeneratedValue
    @Column(name="role_id", unique=true, nullable=false, length=8)

    public String getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    
    @Column(name="role_name", nullable=false, length=10)

    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    @Column(name="level", length=2)

    public String getLevel() {
        return this.level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
   








}