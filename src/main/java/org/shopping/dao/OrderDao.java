package org.shopping.dao;

import org.shopping.pojo.Orders;

public interface OrderDao extends BaseDao<Orders>{
	void save(String sql);
	Orders selectBy(String sql);
}
