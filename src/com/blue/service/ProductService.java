package com.blue.service;

import java.util.List;

import com.cblue.entity.ProductCustom;
import com.cblue.entity.ProductQueryVo;

public interface ProductService {
	
	//根据订单id获得商品信息
	public List<ProductCustom> findProductByOrder(ProductQueryVo productQueryVo);
	
	
	//通过id获得商品信息
	public ProductCustom findProductById(int id);
	
	//修改商品信息
	public void updateProduct(int id,ProductCustom productCustom);

}
