package ssy.com.mapper;

import ssy.com.pojo.Orders;

public interface OrdersMapper {
    Orders selectOrderAndCustomer(Integer orderId);
}
