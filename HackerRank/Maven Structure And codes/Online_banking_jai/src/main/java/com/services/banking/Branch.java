package com.services.banking;


public class Branch {
	private String Branch_name;
	private String Branch_code;
	private String IfciCode;
	private Address address;
	public String getBranch_name() {
		return Branch_name;
	}
	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}
	public String getBranch_code() {
		return Branch_code;
	}
	public void setBranch_code(String branch_code) {
		Branch_code = branch_code;
	}
	public String getIfciCode() {
		return IfciCode;
	}
	public void setIfciCode(String ifciCode) {
		IfciCode = ifciCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
