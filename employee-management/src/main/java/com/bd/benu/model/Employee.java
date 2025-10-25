package com.bd.benu.model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "MASTER_EMPLOYEE")
public class Employee {
	
	@Column(name = "EMP_ID")
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "MOBILE")
	private String mobile;
	
	@Column(name = "EMAIL")
	private String email;
	
	@CreationTimestamp
	private Date createDate;
	
	@UpdateTimestamp
	private Date updateDate;

	public Employee(Object object, String string, String string2, String string3, String string4) {
		super();
	}

	public Employee(Integer empId, String empName, String gender, String mobile, String email, Date createDate,
			Date updateDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Employee(Integer empId, String empName, String gender, String mobile, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
	}
	

}
