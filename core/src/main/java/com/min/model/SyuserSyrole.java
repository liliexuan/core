package com.min.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SyuserSyrole entity.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syuser_syrole")
public class SyuserSyrole implements java.io.Serializable {

	// Fields

	private String syuserId;
	private String syroleId;

	// Constructors

	/** default constructor */
	public SyuserSyrole() {
	}

	/** full constructor */
	public SyuserSyrole(String syuserId, String syroleId) {
		this.syuserId = syuserId;
		this.syroleId = syroleId;
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

	@Column(name = "SYROLE_ID", nullable = false, length = 36)
	public String getSyroleId() {
		return this.syroleId;
	}

	public void setSyroleId(String syroleId) {
		this.syroleId = syroleId;
	}

}