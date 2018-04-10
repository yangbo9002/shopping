package org.shopping.dao.impl;


import org.shopping.dao.ShopDao;
import org.shopping.pojo.Shop;
import org.springframework.stereotype.Repository;
@Repository
public class ShopDaoImpl extends BaseDaoImpl<Shop> implements ShopDao{

	@Override
	public void ShopNew(Shop shop) {
		super.saveOrUpdate(shop);
	}

	

}
