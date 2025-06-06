package com.example.automotive.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cart_id" , nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id" , nullable = false)
    private Product product;

    private Integer quantity;

}
