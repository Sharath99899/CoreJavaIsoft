package com.ProjectSwing;

public class Employee 
{
	private String employeeID;
	private String employeeName;
	private int age;
	private String gender;
	private String emailID;
	private String mobileNumber;
	private String developerType;
	private String state;
	private String country;
	private boolean activeStatus;

	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDeveloperType() {
		return developerType;
	}
	public void setDeveloperType(String developerType) {
		this.developerType = developerType;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}


	@Override
	public String toString() {
		return "Employee ID: " + employeeID + "\n" +
				"Name: " + employeeName + "\n" +
				"Age: " + age + "\n" +
				"Gender: " + gender + "\n" +
				"Email ID: " + emailID + "\n" +
				"Mobile Number: " + mobileNumber + "\n" +
				"Active Status: " + (activeStatus ? "Active" : "Inactive") + "\n" +
				"Developer Type: " + developerType + "\n" +
				"State: " + state + "\n" +
				"Country: " + country;
	}
}
