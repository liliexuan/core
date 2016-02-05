package com.min.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SyuserSyorganization entity.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syuser_syorganization")
public class SyuserSyorganization implements java.io.Serializable {

	// Fields

	private String syuserId;
	private String syorganizationId;

	// Constructors

	/** default constructor */
	public SyuserSyorganization() {
	}

	/** full constructor */
	public SyuserSyorganization(String syuserId, String syorganizationId) {
		this.syuserId = syuserId;
		this.syorganizationId = syorganizationId;
	}

	// Property accessors
	@Id
	@Column(name = "SYUSER_ID", unique = true, nullable = false, length = 36)
	public String getSyuserId() {
		return this.syuserId;
	}

	public void setSyuserId(String syuserId) {
		this.syuserId = syuserId;
	}

	@Column(name = "SYORGANIZATION_ID", nullable = false, length = 36)
	public String getSyorganizationId() {
		return this.syorganizationId;
	}

	public void setSyorganizationId(String syorganizationId) {
		this.syorganizationId = syorganizationId;
	}

}