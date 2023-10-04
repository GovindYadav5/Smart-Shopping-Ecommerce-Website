package com.mycode.ecommerce.dto;

import com.mycode.ecommerce.entity.Address;
import com.mycode.ecommerce.entity.Customer;
import com.mycode.ecommerce.entity.Order;
import com.mycode.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
