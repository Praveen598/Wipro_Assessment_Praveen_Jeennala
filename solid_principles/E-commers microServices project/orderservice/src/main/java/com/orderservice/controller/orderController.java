package com.orderservice.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.entity.Orders;
import com.orderservice.entity.paymentDTO;
import com.orderservice.service.orderServiceInterface;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class orderController {
	@Autowired
	private orderServiceInterface Oservice;
	@PostMapping("/AddOrder")
	public Orders addOrder(@RequestParam String address) {
		return Oservice.saveOrder(address);
		
	}
	@DeleteMapping("/deleteOrder/{id}")
	public void  CancilOrders(@PathVariable Long id) {
		 Oservice.CancilOrders(id);
	}
	@GetMapping("/totalPrice")
	public Long TotalPrice() {
		return Oservice.totalPrice();
	}
	
	@GetMapping("/orders")
	public Page<Orders> listOfOrders(Pageable pageable) {
	    return Oservice.getAllOrders(pageable);
	}

	

}
