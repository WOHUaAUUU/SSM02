package ssy.com.mapper;

import ssy.com.pojo.Customer;

public interface CustomerMapper {
    Customer selectCustomerAndOrder(Integer customerId);
}
