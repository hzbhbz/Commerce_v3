package com.digital.v3.sql.vo;

import lombok.Data;

@Data
public class PartyProductVO {

	private long personId;
	private long productId;
	private long quantity;
	private long orderId;
	private String createDate; // 장바구니에 상품을 추가한 날짜 - 장바구니 상품 식별자

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}
