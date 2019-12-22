package com.dubbo.provider.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {

    private String orderNumber;


    private String name;

    public Order(String orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
    }
}
