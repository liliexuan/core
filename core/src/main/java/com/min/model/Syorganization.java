package com.min.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Syorganization entity.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syorganization")
public class Syorganization implements java.io.Serializable {

	// Fields

	private String id;
	private String address;
	private String code;
	private Date createdatetime;
	private String iconcls;
	private String name;
	private Integer seq;
	private Date updatedatetime;
	private String syorganizationId;

	// Constructors

	/** default constructor */
	public Syorganization() {
	}

	/** minimal constructor */
	public Syorganization(String id) {
		this.id = id;
	}

	/** full constructor */
	public Syorganization(String id, 
			String address, String code, Date createdatetime,
			String iconcls, String name, Integer seq, Date updatedatetime,
			String syorganizationId) {
		this.id = id;
		this.address = address;
		this.code = code;
		this.createdatetime = createdatetime;
		this.iconcls = iconcls;
		this.name = name;
		this.seq = seq;
		this.updatedatetime = updatedatetime;
		this.syorganizationId = syorganizationId;
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

	@Column(name = "ADDRESS", length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "CREATEDATETIME", length = 19)
	public Date getCreatedatetime() {
		return this.createdatetime;
	}

	public void setCreatedatetime(Date createdatetime) {
		this.createdatetime = createdatetime;
	}

	@Column(name = "ICONCLS", length = 100)
	public String getIconcls() {
		return this.iconcls;
	}

	public void setIconcls(String iconcls) {
		this.iconcls = iconcls;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SEQ")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "UPDATEDATETIME", length = 19)
	public Date getUpdatedatetime() {
		return this.updatedatetime;
	}

	public void setUpdatedatetime(Date updatedatetime) {
		this.updatedatetime = updatedatetime;
	}

	@Column(name = "SYORGANIZATION_ID")
	public String getSyorganizationId() {
		return this.syorganizationId;
	}

	public void setSyorganizationId(String syorganizationId) {
		this.syorganizationId = syorganizationId;
	}
}