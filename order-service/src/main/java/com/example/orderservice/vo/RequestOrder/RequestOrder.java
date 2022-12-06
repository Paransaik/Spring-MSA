package com.example.orderservice.vo.RequestOrder;

import lombok.Data;
@Data
public class RequestOrder {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
}
