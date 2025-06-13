package com.prevoyance.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prevoyance.model.OrderRequest;
import com.prevoyance.service.OrderProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderProducer orderProducer;

	/*
	 * @PostMapping public String placeOrder(@RequestBody OrderRequest orderRequest)
	 * { orderProducer.sendOrder(orderRequest); return "Order placed successfully!";
	 * }
	 */
    
    @PostMapping
    public String placeOrders(@RequestBody List<OrderRequest> orderRequest) 
    {
    	for(OrderRequest test:orderRequest)
    	{
    		orderProducer.sendOrder(test);
    	}
        return "Orders placed successfully!";
    }
}
