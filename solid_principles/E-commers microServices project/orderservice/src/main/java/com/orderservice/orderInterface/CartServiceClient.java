package com.orderservice.orderInterface;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.orderservice.entity.Orders;
import com.orderservice.dtos.CartItemDto;
import com.orderservice.dtos.ProductDto;




@FeignClient(name="cartService", path="/api/cart")
public interface CartServiceClient {
    @GetMapping("/getAllCartItems")
    List<CartItemDto> getAllCartItems();
}
