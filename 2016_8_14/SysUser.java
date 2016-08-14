package com.lzu.LzuOl.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lzu.LzuOl.entity.SysPmsn;

/**
 * <p>Title: SysUser</p>
 * <p>Description: TODO</p>
 * <p>Company:@LZU By Author </p>
 *
 * @author J.Q.Wang [wjq_z@qq.com]
 * @date 2016-8-8 下午9:53:56
 * @version 1.0.0
 */

@Entity
@Table(name="sys_user",catalog="lzuol")

public class SysUser  implements java.io.Serializable {


    // Fields    
	 private static final long serialVersionUID = 1L;
	 private String userId;
     private String password;
     private String verificat;
     private String salt;
     private String EMail;
     private List<SysPmsn> menus;
 	 private List<SysPmsn> permission;

    // Constructors

    /** default constructor */
    public SysUser() {
    }

	/** minimal constructor */
    public SysUser(String password) {
        this.password = password;
    }
    
    /** full constructor */
    public SysUser(String password, String verificat, String salt, String EMail) {
        this.password = password;
        this.verificat = verificat;
        this.salt = salt;
        this.EMail = EMail;
    }

   
    // Property accessors
    @Id
    @GeneratedValue
    @Column(name="user_id", unique=true, nullable=false, length=20)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="password", nullable=false, length=30)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="verificat", length=6)

    public String getVerificat() {
        return this.verificat;
    }
    
    public void setVerificat(String verificat) {
        this.verificat = verificat;
    }
    
    @Column(name="salt", length=8)

    public String getSalt() {
        return this.salt;
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    @Column(name="e_mail", length=20)

    public String getEMail() {
        return this.EMail;
    }
    
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    
    
    public List<SysPmsn> getMenus() {
		return menus;
	}

	public List<SysPmsn> getPermission() {
		return permission;
	}

	public void setMenus(List<SysPmsn> menus) {
		this.menus = menus;
	}

	public void setPermission(List<SysPmsn> permission) {
		this.permission = permission;
	}
}