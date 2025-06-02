package com.example.automotive.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private List<CommentDTO> comments;

}
