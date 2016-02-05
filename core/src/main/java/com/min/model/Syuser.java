package com.min.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Syuser entity.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syuser")
public class Syuser implements java.io.Serializable {

	// Fields

	private String id;
	private Integer age;
	private Date createdatetime;
	private String loginname;
	private String name;
	private String photo;
	private String pwd;
	private String sex;
	private Date updatedatetime;
	private String captcha;
	private String extTheme;
	private String status;

	// Constructors

	/** default constructor */
	public Syuser() {
	}

	/** minimal constructor */
	public Syuser(String id, String loginname) {
		this.id = id;
		this.loginname = loginname;
	}

	/** full constructor */
	public Syuser(String id, Integer age, Date createdatetime,
			String loginname, String name, String photo, String pwd,
			String sex, Date updatedatetime, String captcha,
			String extTheme, String status) {
		this.id = id;
		this.age = age;
		this.createdatetime = createdatetime;
		this.loginname = loginname;
		this.name = name;
		this.photo = photo;
		this.pwd = pwd;
		this.sex = sex;
		this.updatedatetime = updatedatetime;
		this.captcha = captcha;
		this.extTheme = extTheme;
		this.status = status;
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

	@Column(name = "AGE")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "CREATEDATETIME", length = 19)
	public Date getCreatedatetime() {
		return this.createdatetime;
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

	@Column(name = "LOGINNAME", nullable = false, length = 100)
	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PHOTO", length = 200)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "PWD", length = 100)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "SEX", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "UPDATEDATETIME", length = 19)
	public Date getUpdatedatetime() {
		return this.updatedatetime;
	}

	public void setUpdatedatetime(Date updatedatetime) {
		this.updatedatetime = updatedatetime;
	}

	@Column(name = "captcha")
	public String getCaptcha() {
		return this.captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	@Column(name = "extTheme")
	public String getExtTheme() {
		return this.extTheme;
	}

	public void setExtTheme(String extTheme) {
		this.extTheme = extTheme;
	}

	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}