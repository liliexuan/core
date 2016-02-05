package com.min.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SyroleSyresource entity. 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syrole_syresource")
public class SyroleSyresource implements java.io.Serializable {

	// Fields

	private String syresourceId;
	private String syroleId;

	// Constructors

	/** default constructor */
	public SyroleSyresource() {
	}

	/** full constructor */
	public SyroleSyresource(String syresourceId, String syroleId) {
		this.syresourceId = syresourceId;
		this.syroleId = syroleId;
	}

	// Property accessors
	@Id
	@Column(name = "SYRESOURCE_ID", unique = true, nullable = false, length = 36)
	public String getSyresourceId() {
		return this.syresourceId;
	}

	public void setSyresourceId(String syresourceId) {
		this.syresourceId = syresourceId;
	}

	@Column(name = "SYROLE_ID", nullable = false, length = 36)
	public String getSyroleId() {
		return this.syroleId;
	}

	public void setSyroleId(String syroleId) {
		this.syroleId = syroleId;
	}

}