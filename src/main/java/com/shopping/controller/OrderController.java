package com.shopping.controller;


import com.shopping.model.Order;
import com.shopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> orders() {
        return new ResponseEntity<List<Order>>(orderService.orders(), HttpStatus.OK);
    }

    @PostMapping("/order")
    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
        return new ResponseEntity<Order>(orderService.addOrder(order), HttpStatus.OK);
    }


























}
