package com.msa.ecommerce.userservice.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseOrder {

    private String productId;
    private Integer qty;
    private Integer price;
    private Integer totalPrice;
    private Date createdAt;

    private String orderId;
}
