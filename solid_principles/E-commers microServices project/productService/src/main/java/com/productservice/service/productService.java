package com.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.entity.Product;
import com.productservice.exception.productNotFoundException;
import com.productservice.repo.productRepo;

@Service
public class productService implements productServiceInterface {
	@Autowired
	public productRepo repo;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		
		return repo.findById(id).orElseThrow(()->new productNotFoundException("this product not available"));
	}

	@Override
	public void deleteProduct(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Product UpdateProduct(Long id, Product product) {
		Product exist=repo.findById(id).orElseThrow(()->new productNotFoundException("this product not available"));
		exist.setCategory(product.getCategory());
		exist.setPrice(product.getPrice());
		exist.setQuantity(product.getQuantity());
		return repo.save(exist);
		
		
	}

}
