package org.shopping.dao.impl;

import org.shopping.dao.OrderDao;
import org.shopping.pojo.Orders;
import org.springframework.stereotype.Repository;
@Repository
public class OderDaoIpml extends BaseDaoImpl<Orders> implements OrderDao{

	@Override
	public void ShopSelling(Orders orders) {
		super.saveOrUpdate(orders);
		
	}

}
