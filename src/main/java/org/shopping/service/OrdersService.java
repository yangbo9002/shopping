package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Orders;

public interface OrdersService {

	List<Orders> select(String sql);
}
