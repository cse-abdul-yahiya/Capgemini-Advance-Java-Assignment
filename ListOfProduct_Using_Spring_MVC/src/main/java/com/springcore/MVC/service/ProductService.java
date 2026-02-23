/**
 * 
 */
package com.springcore.MVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springcore.MVC.dao.ProductDAO;
import com.springcore.MVC.model.Product;

/**
 * 
 */
@Service
public class ProductService {

    ProductDAO productDAO;

    // Constructor Injection
    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> fetchProducts() {
        return productDAO.getAllProducts();
    }
}

