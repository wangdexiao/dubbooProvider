package com.dubbo.provider.api;

import com.dubbo.provider.bean.Order;

public interface OrderService {

    Order getOrder(String orderNum);
}
