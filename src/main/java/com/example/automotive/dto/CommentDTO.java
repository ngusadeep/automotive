package com.example.automotive.dto;


import lombok.Data;

@Data
public class CommentDTO {
    private long id;
    private String content;
    private Integer score;
    private long userId;
}
