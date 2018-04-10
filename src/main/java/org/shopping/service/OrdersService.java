package org.shopping.service;

import java.util.List;

import org.shopping.pojo.OrderGoods;
import org.shopping.pojo.Orders;


public interface OrdersService {

	List<OrderGoods> select(String sql);//查询方法
	Object selectById(Integer id);//根据编号查询单个对象
	void saveOrUpdate(Object obj );//添加或修改
	void delete(Integer id);//删除方法
}
