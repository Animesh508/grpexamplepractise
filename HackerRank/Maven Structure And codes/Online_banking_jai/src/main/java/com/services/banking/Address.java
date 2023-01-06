package com.services.banking;


public class Address {
	private String addressline1;
	private String City_name;
	private Integer pincode;
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getCity_name() {
		return City_name;
	}
	public void setCity_name(String city_name) {
		City_name = city_name;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Account [addressline1=" + addressline1 + ", City_name=" + City_name + ", pincode=" + pincode + "]";
	}
	
	

}
