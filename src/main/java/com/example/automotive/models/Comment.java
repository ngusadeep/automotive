package com.example.automotive.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    private Integer score;
    private long userId;
    @OneToMany
    @JoinColumn(name = "product_id" , nullable = false)
    private Product product;
    @OneToMany
    @JoinColumn(name = "user_id" , nullable = false)
    private User user;
}
