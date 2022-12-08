package online_banking.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Account {

	private Long accountNumber;
	private Long customerNumber;
	private String accountHolderName;
	@Autowired
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
		return "Account [accountNumber=" + accountNumber + ", customerNumber=" + customerNumber + ", accountHolderName="
				+ accountHolderName + ", branch=" + branch + "]";
	}
		
}
