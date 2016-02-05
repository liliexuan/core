package com.min.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SyorganizationSyresource entity.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syorganization_syresource")
public class SyorganizationSyresource implements java.io.Serializable {

	private String syorganizationId;
	private String syresourceId;

	// Constructors

	/** default constructor */
	public SyorganizationSyresource() {
	}

	/** full constructor */
	public SyorganizationSyresource(String syorganizationId,
			String syresourceId) {
		this.syorganizationId = syorganizationId;
		this.syresourceId = syresourceId;
	}

	// Property accessors
	@Id
	@Column(name = "SYORGANIZATION_ID", nullable = false, length = 36)
	public String getSyorganizationId() {
		return this.syorganizationId;
	}

	public void setSyorganizationId(String syorganizationId) {
		this.syorganizationId = syorganizationId;
	}

	@Column(name = "SYRESOURCE_ID", nullable = false, length = 36)
	public String getSyresourceId() {
		return this.syresourceId;
	}

	public void setSyresourceId(String syresourceId) {
		this.syresourceId = syresourceId;
	}

}