package com.cartservice.cartInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cartservice.entity.Cart;
import com.cartservice.entity.ProductDTO;

@FeignClient(name="ProductService",path="/api/product")
public interface cartInterface {
	@GetMapping("/getById/{id}")
	public ProductDTO getProductById(@RequestParam Long id);

}



