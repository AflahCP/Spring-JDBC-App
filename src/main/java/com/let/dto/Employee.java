package com.let.dto;

import java.time.LocalDate;

public class Employee {
	private Integer empId;
	
	private String eName;
	
	private String eMail;
	
	private LocalDate createDate;
	
	private String createdBy;

	
	
	public Employee() {
		
	}

	public Employee(Integer empId, String eName, String eMail, LocalDate createDate, String createdBy) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.eMail = eMail;
		this.createDate = createDate;
		this.createdBy = createdBy;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", eMail=" + eMail + ", createDate=" + createDate
				+ ", createdBy=" + createdBy + "]";
	}
	
	
}
