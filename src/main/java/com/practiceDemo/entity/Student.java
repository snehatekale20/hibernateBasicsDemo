package com.practiceDemo.entity;

public class Student {

	int rollNo;
	String studName;
	String studAdd;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAdd() {
		return studAdd;
	}
	public void setStudAdd(String studAdd) {
		this.studAdd = studAdd;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", studAdd=" + studAdd + "]";
	}
	
	
}
