package com.paymentservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="orderService",path="/api/orders")
public interface PaymentFeignClient {

	@GetMapping("/totalPrice")
	public Long TotalPrice();

}
