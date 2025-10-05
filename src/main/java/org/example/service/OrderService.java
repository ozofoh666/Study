package org.example.service;

import jakarta.annotation.Resource;
import org.example.dao.OrderMapper;
import org.example.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Resource
    private OrderMapper orderMapper;

    public Order getOrderDetail(int orderId) {
        return orderMapper.orderById(orderId);
    }
}
