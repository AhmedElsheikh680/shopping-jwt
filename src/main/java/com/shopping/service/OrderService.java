package com.shopping.service;


import com.shopping.model.Order;
import com.shopping.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public List<Order> orders() {
        return orderRepo.findAll();
    }

    public Order addOrder(Order order) {
        return orderRepo.save(order);
    }



































}
