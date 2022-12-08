package com.services_NIKE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Branch {
	private String branchName;
	private String branchCode;
    private String ifciCode;
    
    @Autowired
    private Address address;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getIfciCode() {
		return ifciCode;
	}

	public void setIfciCode(String ifciCode) {
		this.ifciCode = ifciCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", branchCode=" + branchCode + ", ifciCode=" + ifciCode
				+ ", address=" + address + "]";
	}
    
    
}
