package com.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cartservice.dtos.CartItemDto;
import com.cartservice.entity.Cart;

import com.cartservice.service.servicesInterface;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cart")
public class CartController {
	@Autowired
	private servicesInterface service;
	@PostMapping("/addCart/{id}")
	public Cart addCart(@PathVariable Long id, @RequestParam Long quantity) {
	    return service.saveItemIntoCart(id, quantity);
	}
	@DeleteMapping("/deleteCartItem/{id}")
	public void deleteCartItem(@PathVariable Long id) {
		service.deleteCartItem(id);
	}
	@PatchMapping("/updateQuantity/{id}")
	public Cart UpdateQuantity(@PathVariable Long id,@RequestParam Long quantity) {
		return service.updateQuantity(id,quantity);
	}
	@GetMapping("/getAllCartItems")
	public List<CartItemDto> getAllCartProducts() {
	    return service.getAllServiceProducts();
	}


}
