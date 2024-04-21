package com.thiruacademy.vo;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
public class Department {
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
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
	public Department() {
		super();
	}
	public Department(String departmentName, String departmentAddress, String departmentCode) {
		this();
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	
	
}