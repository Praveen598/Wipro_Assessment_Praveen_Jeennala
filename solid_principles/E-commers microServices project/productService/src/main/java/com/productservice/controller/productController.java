package com.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.entity.Product;
import com.productservice.service.productServiceInterface;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

@RequiredArgsConstructor
@RequestMapping("/api/product")
public class productController {
	@Autowired
	private productServiceInterface service;
	
	
	//save product
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
		
	}
	//get all
	@GetMapping("/getAll")
	 public List<Product> getAllProducts(){
		return service.getAllProducts();
		 
	 }
	
	//getbyid
	@GetMapping("/getById/{id}")
	public Product getProductById(@PathVariable Long id) {
		return service.getProductById(id);
	}
	
	
	//deleteProduct
	@DeleteMapping("/deleteById/{id}")
	public void deleteProduct(@PathVariable Long id) {
		service.deleteProduct(id);
	}
	
	//update product
	@PutMapping("/updateProduct")
	public Product updateProduct(@PathVariable Long id,@RequestBody Product product) {
		return service.UpdateProduct(id,product);
	}
	
	
	
}
