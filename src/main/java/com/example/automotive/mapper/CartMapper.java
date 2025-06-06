package com.example.automotive.mapper;

import com.example.automotive.dto.CartDTO;
import com.example.automotive.dto.CartItemDTO;

import com.example.automotive.models.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.example.automotive.models.Cart;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(target = "userId" , source = "user.id")
    CartDTO toDTO (Cart cart);

    @Mapping(target = "user.id" , source = "userId")
    Cart toEntity (CartDTO cartDTO);

    @Mapping(target = "productId" , source = "product.id")
    CartItemDTO cartItemDTO(CartItem cartItem);

    @Mapping(target = "product,id" , source = "productId")
    CartItem cartItem(CartItemDTO cartItemDTO);
}
