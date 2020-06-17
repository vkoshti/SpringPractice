package com.example.learning02.service;

import java.util.HashSet;
import java.util.Set;


import org.springframework.stereotype.Service;


import com.example.learning02.model.Product;


@Service
public class ProductsService {

	private static ProductsService instance;
    private Set<Product> products = new HashSet<>();
    
    private ProductsService() {
    	
    }


    public Set<Product> getProducts() {
        products.add(new Product("1001", "Product1", 200));
        products.add(new Product("1002", "Product2", 200));
        products.add(new Product("1003", "Product3", 200));


        return products;
    }

    public static ProductsService getInstance() {
    	if (instance == null)
    		instance = new ProductsService();
    	return instance;
    }

}