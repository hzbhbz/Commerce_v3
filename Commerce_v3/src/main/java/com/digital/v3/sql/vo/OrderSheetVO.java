package com.digital.v3.sql.vo;

import java.util.List;

import lombok.Data;

@Data
public class OrderSheetVO {

	private long orderId;
	private long personId;
	private AddressVO addressVo;
	private PhoneVO phoneVo;
	private List<PartyProductVO> partyProductVoList;
	private String purchaseDate;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public AddressVO getAddressVo() {
		return addressVo;
	}
	public void setAddressVo(AddressVO addressVo) {
		this.addressVo = addressVo;
	}
	public PhoneVO getPhoneVo() {
		return phoneVo;
	}
	public void setPhoneVo(PhoneVO phoneVo) {
		this.phoneVo = phoneVo;
	}
	public List<PartyProductVO> getPartyProductVoList() {
		return partyProductVoList;
	}
	public void setPartyProductVoList(List<PartyProductVO> partyProductVoList) {
		this.partyProductVoList = partyProductVoList;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	


	
}
