package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.OrderDao;
import org.shopping.dao.OrdersDao;
import org.shopping.pojo.OrderGoods;
import org.shopping.pojo.Orders;
import org.shopping.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional 
public class OrdersServiceImpl implements OrdersService{
	
	@Resource
	private OrdersDao od;
	@Resource
	private OrderDao ood;

	@Override
	public List<OrderGoods> select(String sql) {
		List<OrderGoods> oGoods = od.select(sql);
		return oGoods;
	}
	
	
	public List<OrderGoods> selectAll(String sql) {
		List<OrderGoods> oGoods = od.select(sql);
		return oGoods;
	}

	@Override
	public Object selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Object obj ) {
		ood.saveOrUpdate((Orders)obj);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
