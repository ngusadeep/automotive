package com.example.automotive.dto;

import lombok.Data;

@Data
public class CartItem {
    private long id;
    private long productId;
    private Integer quantity;
}
