package com.cartservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Product DTO from ProductService
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
 private Long id;
 private String name;
 private Long price;
 // add other fields if needed
}

