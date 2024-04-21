package com.thiruacademy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @Data
 */
@Table(name="tbl_department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentAddress = departmentAddress;
	this.departmentCode = departmentCode;
}
public Department() {
	super();
}
	
	
}
