package com.min.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Syresource entity.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "syresource")
public class Syresource implements java.io.Serializable {

	// Fields

	private String id;
	private Date createdatetime;
	private String description;
	private String iconcls;
	private String name;
	private Integer seq;
	private String target;
	private Date updatedatetime;
	private String url;
	private String syresourceId;
	private String syresourcetypeId;

	// Constructors

	/** default constructor */
	public Syresource() {
	}

	/** minimal constructor */
	public Syresource(String id, String name) {
		this.id = id;
		this.name = name;
	}

	/** full constructor */
	public Syresource(String id, Date createdatetime, String description,
			String iconcls, String name, Integer seq, String target,
			Date updatedatetime, String url, String syresourceId,
			String syresourcetypeId) {
		this.id = id;
		this.createdatetime = createdatetime;
		this.description = description;
		this.iconcls = iconcls;
		this.name = name;
		this.seq = seq;
		this.target = target;
		this.updatedatetime = updatedatetime;
		this.url = url;
		this.syresourceId = syresourceId;
		this.syresourcetypeId = syresourcetypeId;
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

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "ICONCLS", length = 100)
	public String getIconcls() {
		return this.iconcls;
	}

	public void setIconcls(String iconcls) {
		this.iconcls = iconcls;
	}

	@Column(name = "NAME", nullable = false, length = 100)
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

	@Column(name = "TARGET", length = 100)
	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Column(name = "UPDATEDATETIME", length = 19)
	public Date getUpdatedatetime() {
		return this.updatedatetime;
	}

	public void setUpdatedatetime(Date updatedatetime) {
		this.updatedatetime = updatedatetime;
	}

	@Column(name = "URL", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "SYRESOURCE_ID", length = 36)
	public String getSyresourceId() {
		return this.syresourceId;
	}

	public void setSyresourceId(String syresourceId) {
		this.syresourceId = syresourceId;
	}

	@Column(name = "SYRESOURCETYPE_ID", length = 36)
	public String getSyresourcetypeId() {
		return this.syresourcetypeId;
	}

	public void setSyresourcetypeId(String syresourcetypeId) {
		this.syresourcetypeId = syresourcetypeId;
	}

}