package com.productservice.service;

import java.util.List;

import com.productservice.entity.Product;

public interface productServiceInterface {

	Product addProduct(Product product);

	List<Product> getAllProducts();

	Product getProductById(Long id);

	void deleteProduct(Long id);

	Product UpdateProduct(Long id, Product product);

	

}
