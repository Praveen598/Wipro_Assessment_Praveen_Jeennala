package com.paymentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentservice.feign.PaymentFeignClient;
import com.paymentservice.repo.paymentRepository;

@Service
public class PaytmentServices implements paymentServiceInterface {
	@Autowired
	private paymentRepository repo;
	@Autowired
	private PaymentFeignClient client;
	
	@Override
	public Long totalPrice() {
		
		
		return client.TotalPrice() ;
	}

	 @Override
	    public String orderStatus() {
	        Long price = client.TotalPrice(); // call inside method, after injection
	        return "Order confirmed, total price is " + price;
	    }

}
