package com.digital.v3.sql.vo;

import java.util.List;

import lombok.Data;

@Data
public class PersonVO {

	private long personId;
	private String personName;
	private String gender;
	private String password;
	private List<AddressVO> addressVoList;
	private List<PhoneVO> phoneVoList;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AddressVO> getAddressVoList() {
		return addressVoList;
	}

	public void setAddressVoList(List<AddressVO> addressVoList) {
		this.addressVoList = addressVoList;
	}

	public List<PhoneVO> getPhoneVoList() {
		return phoneVoList;
	}

	public void setPhoneVoList(List<PhoneVO> phoneVoList) {
		this.phoneVoList = phoneVoList;
	}

}
