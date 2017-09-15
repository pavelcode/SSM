package com.cblue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	
	@RequestMapping("/test")
	public void mytest(){
		System.out.println("test");
	}
}
