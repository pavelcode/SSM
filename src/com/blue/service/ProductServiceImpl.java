package com.blue.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.cblue.entity.Product;
import com.cblue.entity.ProductCustom;
import com.cblue.entity.ProductQueryVo;
import com.cblue.mapper.ProductCustomMapper;
import com.cblue.mapper.ProductMapper;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductCustomMapper productCustomMapper;  //直接注入，因为spring会扫描mapper
	@Autowired
	private ProductMapper productMapper;

	public List<ProductCustom> findProductByOrder(ProductQueryVo productQueryVo) {
		// TODO Auto-generated method stub
		
		return productCustomMapper.findProductByOrderId(productQueryVo);
	}

	public ProductCustom findProductById(int id) {
		// TODO Auto-generated method stub
		
		Product product = productMapper.selectByPrimaryKey(id);
		
		ProductCustom productCustom = new ProductCustom();
		//把product中的内容设置productCustom中
		BeanUtils.copyProperties(product, productCustom);
		
		return productCustom;
	}

	public void updateProduct(int id, ProductCustom productCustom) {
		// TODO Auto-generated method stub
		productCustom.setId(id);
		//商品信息是text数据类型，所以使用下面方法
		productMapper.updateByPrimaryKeyWithBLOBs(productCustom);
	}

}
