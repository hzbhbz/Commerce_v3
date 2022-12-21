package com.digital.v3.sql.vo;

import lombok.Data;

@Data
public class PartyPhoneVO {

	private long personId;
	private long phoneId;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

}
