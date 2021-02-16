package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServicesImpl {
    @Autowired
    OrdersRepository orderrepos;

    @Override public Order save(Order order)
    {
        return orderrepos.save(order);
    }
}
