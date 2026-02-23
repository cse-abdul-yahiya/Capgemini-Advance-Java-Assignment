/**
 * 
 */
package com.springcore.MVC.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcore.MVC.model.Product;
import com.springcore.MVC.service.ProductService;

//import ch.qos.logback.core.model.Model;

/**
 * 
 */
@Controller
public class ProductController {
	ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService=productService;
		
	}
	  @RequestMapping("/products")
	    public String showProducts(Model model) {

	        List<Product> productList = productService.fetchProducts();

	        model.addAttribute("products", productList);

	        return "products";
	    }
	
 
}
