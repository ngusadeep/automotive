package com.example.automotive.dto;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class CartItemDTO {
    private long id;
    private long productId;
    @PositiveOrZero
    private Integer quantity;
}
