package com.example.automotive.dto;

import lombok.Data;

import java.util.List;

@Data
public class CartDTO {
    private long Id;
    private long userId;
    private List<CartItem> items;
}
