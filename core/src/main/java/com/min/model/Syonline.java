package com.min.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Syonline entity.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syonline")
public class Syonline implements java.io.Serializable {

	// Fields

	private String id;
	private Date createdatetime;
	private String ip;
	private String loginname;
	private String type;

	// Constructors

	/** default constructor */
	public Syonline() {
	}

	/** minimal constructor */
	public Syonline(String id) {
		this.id = id;
	}

	/** full constructor */
	public Syonline(String id, Date createdatetime, String ip,
			String loginname, String type) {
		this.id = id;
		this.createdatetime = createdatetime;
		this.ip = ip;
		this.loginname = loginname;
		this.type = type;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "CREATEDATETIME", length = 19)
	public Date getCreatedatetime() {
		return this.createdatetime;
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

	@Column(name = "IP", length = 100)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "LOGINNAME", length = 100)
	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	@Column(name = "TYPE", length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}