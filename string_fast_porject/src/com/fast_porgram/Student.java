package com.fast_porgram;

public class Student {
	private String name;
	private Integer rollNumber;
	private String collegeName;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", collegeName=" + collegeName + ", age=" + age
				+ "]";
	}
	
	
	

}
