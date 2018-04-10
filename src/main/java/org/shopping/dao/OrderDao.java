package org.shopping.dao;

import org.shopping.pojo.Orders;

public interface OrderDao extends BaseDao<Orders>{
	void ShopSelling(Orders orders);//卖出商品后新增订单
}
