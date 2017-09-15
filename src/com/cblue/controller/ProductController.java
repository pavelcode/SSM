package com.cblue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blue.service.ProductService;
import com.cblue.entity.Orders;
import com.cblue.entity.ProductCustom;
import com.cblue.entity.ProductQueryVo;


@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/findproductbyorderid")
	public ModelAndView findProductByOrderId(int id){
		System.out.println("findProductByOrderId==id="+id);
		ProductQueryVo productQueryVo = new ProductQueryVo();
		Orders orders = new Orders();
		orders.setId(id);
		productQueryVo.setOrders(orders);
		
		List<ProductCustom> productCustoms = productService.findProductByOrder(productQueryVo);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("products", productCustoms);
		mv.setViewName("product/productinfo");
		return mv;
	}
	
	
	//跳转到更新页面
	@RequestMapping("/updateProductUI")
	public ModelAndView updateUI(int id){
		ProductCustom productCustom = productService.findProductById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("product", productCustom);
		mv.setViewName("product/productinfo");
		return mv;
		
	}
	//更新用户信息
	@RequestMapping("/updateProduct")
	public ModelAndView updateProduct(ProductCustom productCustom){
		productService.updateProduct(productCustom.getId(), productCustom);
		ModelAndView mv = new ModelAndView();
		mv.addObject("product", productCustom);
		mv.setViewName("product/productinfo");
		return mv;
		
	}
	
	
	
	
	
	
}
