package org.shopping.dao;

import org.shopping.pojo.Orders;

public interface OrderDao extends BaseDao<Orders>{
	void ShopSelling(Orders orders);//������Ʒ����������
}
