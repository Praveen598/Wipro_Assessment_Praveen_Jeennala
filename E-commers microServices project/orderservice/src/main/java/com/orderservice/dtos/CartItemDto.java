package com.orderservice.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
	
	private Long pid;

   
    private String productName;
    private Long price;
    private Integer quantity;
}


