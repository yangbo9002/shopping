package org.shopping.dao.impl;

import org.shopping.dao.LogisticsDao;
import org.shopping.pojo.Logistics;
import org.springframework.stereotype.Repository;
@Repository
public class LogisticsDaoImpl extends BaseDaoImpl<Logistics> implements LogisticsDao{

	@Override
	public void ShopSelling(Logistics logistics) {
		super.saveOrUpdate(logistics);
		
	}

}
