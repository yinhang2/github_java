package com.lzu.LzuOl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: SysPmsn</p>
 * <p>Description: TODO</p>
 * <p>Company:@LZU By Author </p>
 *
 * @author J.Q.Wang [wjq_z@qq.com]
 * @date 2016-8-8 下午9:58:03
 * @version 1.0.0
 */

@Entity
@Table(name="sys_pmsn",catalog="lzuol")
public class SysPmsn  implements java.io.Serializable {


    // Fields    
	 private static final long serialVersionUID = 1L;
	 private String pmsnId;
     private String pmsnName;
     private String url;
     private Integer level;
     private String type;
     private Integer isUse;


    // Constructors

    /** default constructor */
    public SysPmsn() {
    }

	/** minimal constructor */
    public SysPmsn(String pmsnName, String url) {
        this.pmsnName = pmsnName;
        this.url = url;
    }
    
    /** full constructor */
    public SysPmsn(String pmsnName, String url, Integer level, String type, Integer isUse) {
        this.pmsnName = pmsnName;
        this.url = url;
        this.level = level;
        this.type = type;
        this.isUse = isUse;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="pmsn_id", unique=true, nullable=false, length=8)

    public String getPmsnId() {
        return this.pmsnId;
    }
    
    public void setPmsnId(String pmsnId) {
        this.pmsnId = pmsnId;
    }
    
    @Column(name="pmsn_name", nullable=false, length=10)

    public String getPmsnName() {
        return this.pmsnName;
    }
    
    public void setPmsnName(String pmsnName) {
        this.pmsnName = pmsnName;
    }
    
    @Column(name="url", nullable=false, length=20)

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    @Column(name="level")

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }
    
    @Column(name="type", length=4)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="is_use")

    public Integer getIsUse() {
        return this.isUse;
    }
    
    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }
   








}