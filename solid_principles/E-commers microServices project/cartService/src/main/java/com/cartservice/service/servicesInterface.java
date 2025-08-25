package com.cartservice.service;

import java.util.List;

import com.cartservice.dtos.CartItemDto;
import com.cartservice.entity.Cart;

public interface servicesInterface {

	Cart saveItemIntoCart(Long id, Long quantity);



	void deleteCartItem(Long id);



	Cart updateQuantity(Long id, Long quantity);



	List<CartItemDto> getAllServiceProducts();



}
