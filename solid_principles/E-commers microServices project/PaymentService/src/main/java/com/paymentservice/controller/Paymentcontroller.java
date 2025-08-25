package com.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentservice.service.paymentServiceInterface;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/payment")
public class Paymentcontroller {
	@Autowired
	private paymentServiceInterface Pservice;
	
	//totalprice
	@GetMapping("/totalPrice")
	public Long TotalPrice() {
		
		return Pservice.totalPrice();
	}
	@GetMapping("/status")
	public String OrderStatus() {
		return Pservice.orderStatus();
	}

}
