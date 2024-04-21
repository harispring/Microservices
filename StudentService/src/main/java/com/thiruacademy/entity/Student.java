package com.thiruacademy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @Data
 */
@Table(name="table_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long studentId;
	private String firstName;
	private String lastName;
	private String email;
	private Long departmentId;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	public Student(Long studentId, String firstName, String lastName, String email, Long departmentId) {
		this();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.departmentId = departmentId;
	}
	public Student() {
		super();
	}
	
	
	
	
}
