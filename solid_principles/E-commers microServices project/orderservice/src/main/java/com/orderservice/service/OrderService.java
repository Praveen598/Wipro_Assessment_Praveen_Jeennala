package com.orderservice.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.orderservice.dtos.CartItemDto;
import com.orderservice.dtos.ProductDto;
import com.orderservice.entity.Orders;
import com.orderservice.entity.paymentDTO;
import com.orderservice.orderInterface.CartServiceClient;
import com.orderservice.repo.orderRepo;

@Service
public class OrderService implements orderServiceInterface{

    @Autowired
    private orderRepo repo;

    @Autowired
    private CartServiceClient inter; // Feign client
    Long   totalPrices;
    

    @Override
    public Orders saveOrder(String address) {
        List<CartItemDto> cartItems = inter.getAllCartItems();

        // Extract only product IDs

List<Long> productIds = cartItems.stream()
  .map(CartItemDto::getPid)
  .filter(Objects::nonNull)   // avoids nulls
  .collect(Collectors.toList()); 
         totalPrices = cartItems.stream()
                .mapToLong(i -> {
                    long price = i.getPrice() != null ? i.getPrice() : 0L;
                    long qty   = i.getQuantity() != null ? i.getQuantity() : 0L;
                    return price * qty;
                })
                .sum();

        Orders order = new Orders();
        order.setProducts(productIds); // store only IDs
        order.setAddress(address);
        order.setPrice(totalPrices);

        return repo.save(order);
    }



	@Override
	public void CancilOrders(Long id) {
		repo.deleteById(id);
		
	}



	@Override
	public Long totalPrice() {
		
		return totalPrices;
	}



	



	@Override
	public Page<Orders> getAllOrders(Pageable pageable) {
		// TODO Auto-generated method stub
		return repo.findAll(pageable);
	}
}
