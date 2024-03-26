package com.practiceDemo.entity.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="cust_Id")
	int custId;
	
	@Column(name = "cust_name")
	String custName;
	
	@Column(name="cust_Address")
	String custAddress;
	
	@Column(name="cust_email")
	String emailId;
	
	@Column(name="pinCode")
	int pinCode;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "CustomerWithAnnotation [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", emailId=" + emailId + ", pinCode=" + pinCode + "]";
	}
	
	

}
