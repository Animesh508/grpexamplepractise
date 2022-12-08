package com.services_NIKE;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String addressLine1 ;
	private String cityName ;
	private Integer pinCode ;
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", cityName=" + cityName + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
