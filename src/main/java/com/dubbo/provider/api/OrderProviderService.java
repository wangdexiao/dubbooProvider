package com.dubbo.provider.api;

import com.dubbo.provider.bean.Order;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class OrderProviderService implements OrderService{

    public Order getOrder(String orderNum) {
        return new Order(orderNum,"苹果");
    }
}
