/**
 * 
 */
package com.springcore.MVC.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springcore.MVC.model.Product;

/**
 * 
 */
@Repository
public class ProductDAO {
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<>();
		products.add(new Product(1,"Laptop",232456.56));
		products.add(new Product(2,"Phone",134560.5));
		products.add(new Product(3,"Shoes",23456.6));
		return products;
		
	}

}
