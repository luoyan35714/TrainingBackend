package com.msclub.training.model;

import java.sql.Date;

public class GetTrainingPlanResponse {

	private Integer id;

	private String name;
	private String year;
	private Integer creatorId;
	private String creator;
	private Date createDate;
	private Integer updatedById;
	private String updatedBy;
	private Date lastUpdateDate;
	private Integer deletedInd;
	private String deletedBy;
	private Integer deletedById;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getUpdatedById() {
		return updatedById;
	}

	public void setUpdatedById(Integer updatedById) {
		this.updatedById = updatedById;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getDeletedInd() {
		return deletedInd;
	}

	public void setDeletedInd(Integer deletedInd) {
		this.deletedInd = deletedInd;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Integer getDeletedById() {
		return deletedById;
	}

	public void setDeletedById(Integer deletedById) {
		this.deletedById = deletedById;
	}

}
