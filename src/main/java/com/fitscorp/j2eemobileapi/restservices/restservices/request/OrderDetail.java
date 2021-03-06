package com.fitscorp.j2eemobileapi.restservices.restservices.request;


public class OrderDetail {

	private Long productId;
	private int quantity;
	
	public OrderDetail() {}

	public OrderDetail(Long productId, int quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}