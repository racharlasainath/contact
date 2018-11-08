package com.contacts.modal;

public class AgileBase {
	private int createdBy;
	private String createdDate;
	private boolean isActive;
	private int updatedBy;
	private String updatedDate;
	public AgileBase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgileBase(int createdBy, String createdDate, boolean isActive, int updatedBy, String updatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "AgileBase [createdBy=" + createdBy + ", createdDate=" + createdDate + ", isActive=" + isActive
				+ ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	

}
