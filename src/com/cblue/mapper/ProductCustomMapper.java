package com.cblue.mapper;

import com.cblue.entity.Product;
import com.cblue.entity.ProductCustom;
import com.cblue.entity.ProductExample;
import com.cblue.entity.ProductQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCustomMapper {
	
	
	public List<ProductCustom> findProductByOrderId(ProductQueryVo productQueryVo);


}