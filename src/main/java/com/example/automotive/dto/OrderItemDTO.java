package com.example.automotive.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class OrderItemDTO {
    private long id;
    private long productId;
    @PositiveOrZero
    private Integer quantity;
    @Positive
    private BigDecimal price;

}
