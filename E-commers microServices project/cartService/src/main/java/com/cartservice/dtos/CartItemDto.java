package com.cartservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
public class CartItemDto {
    private Long pid;
    private Long quantity;
    private Long price;

    public CartItemDto(Long pid, Long quantity, Long price) {
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;
    }

    // getters and setters
}


