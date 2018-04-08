package org.shopping.dao.impl;

import org.shopping.dao.OrdersDao;
import org.shopping.pojo.OrderGoods;
import org.shopping.pojo.Orders;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDaoImpl extends BaseDaoImpl<OrderGoods> implements OrdersDao{

}
