package com.digital.v3.sql.vo;

import lombok.Data;

@Data
public class ProductVO {

	private long productId;
	private String productName;
	private long price;
	private CategoryVO categoryVo;
	private long quantity;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public CategoryVO getCategoryVo() {
		return categoryVo;
	}

	public void setCategoryVo(CategoryVO categoryVo) {
		this.categoryVo = categoryVo;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}
