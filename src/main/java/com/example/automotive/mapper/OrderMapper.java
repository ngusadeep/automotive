package com.example.automotive.mapper;

import com.example.automotive.dto.OrderDTO;
import com.example.automotive.dto.OrderItemDTO;
import com.example.automotive.models.Order;
import com.example.automotive.models.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "userId" , source = "user.id")
    @Mapping(target = "orderItems" , source = "items")
    OrderDTO orderDTO(Order order);

    @Mapping(target = "userId" , source = "user.id")
    @Mapping(target = "items" , source = "orderItems")
    Order toEntity(OrderDTO orderDTO);

    List<OrderDTO> toDTOs(List<Order> orders);
    List<Order> toEntities(List<OrderDTO> orderDTOS);

    OrderItem toOrderItemEntity(OrderItemDTO orderItemDTO);

}
