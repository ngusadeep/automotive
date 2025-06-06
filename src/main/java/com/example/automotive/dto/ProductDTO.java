package com.example.automotive.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private long id;
    @NotBlank(message = "Product name is required.")
    private String name;
    @NotBlank(message = "Product description is required.")
    private String description;
    @Positive(message = "Price cannot be negative")
    private BigDecimal price;
    @PositiveOrZero(message = "Quantity cannot be negative")
    private Integer quantity;
    private List<CommentDTO> comments;

}
