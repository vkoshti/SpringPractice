package com.example.learning02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning02.service.ProductsService;
@Controller
public class ProductController {
	
	@RequestMapping("/products")
	public String fetchProducts() {
		return "welcome";
	}
	
}
