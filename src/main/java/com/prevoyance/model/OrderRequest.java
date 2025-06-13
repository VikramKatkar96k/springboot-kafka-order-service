package com.prevoyance.model;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequest {
    private String orderId;
    private String userId;
    private Double amount;
    private List<String> items;
}
