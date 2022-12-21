package com.digital.v3.sql.vo;

import lombok.Data;

@Data
public class AddressVO {

	private long addressId;
	private String addressDetail;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

}
