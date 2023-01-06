package com.services.banking;

import org.springframework.stereotype.Component;

@Component
public class Accounts {
	private Long accountNumber;
	private Long customerNumber;
	private String accountHolderName;
	private Branch branch;
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Accounts [accountNumber=" + accountNumber + ", customerNumber=" + customerNumber
				+ ", accountHolderName=" + accountHolderName + ", branch=" + branch + "]";
	}
	

}
