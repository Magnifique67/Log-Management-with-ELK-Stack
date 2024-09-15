package com.week3.Log_Management_with_ELK_Stack.controller;

import com.week3.Log_Management_with_ELK_Stack.model.Order;
import com.week3.Log_Management_with_ELK_Stack.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public String createOrder(@RequestParam int orderId, @RequestParam double amount) {
        Order order = new Order(orderId, amount);
        orderService.createOrder(order);  // This will trigger the logging
        return "Order created";
    }
}
