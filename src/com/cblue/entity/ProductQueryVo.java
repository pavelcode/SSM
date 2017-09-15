package com.cblue.entity;

public class ProductQueryVo {
	
	//订单信息
	private Orders orders;
	
	//商品扩展类
	private ProductCustom productCustom;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public ProductCustom getProductCustom() {
		return productCustom;
	}

	public void setProductCustom(ProductCustom productCustom) {
		this.productCustom = productCustom;
	}
	
	
	
	

}
