package com.digital.v3.sql.vo;

import lombok.Data;

@Data
public class PhoneVO {

	private long phoneId;
	private String phoneNumber;

	public long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
