package com.orderservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.orderservice.entity.Orders;
import com.orderservice.entity.paymentDTO;
import com.orderservice.entity.Orders;

public interface orderServiceInterface {

	

	Orders saveOrder(String address);

	void CancilOrders(Long id);

	Long totalPrice();

	Page<Orders> getAllOrders(Pageable pageable);



}
