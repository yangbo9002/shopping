package org.shopping.dao.impl;

import java.util.List;

import org.shopping.dao.ShopDao;
import org.shopping.pojo.Goods;
import org.shopping.pojo.Shop;
import org.springframework.stereotype.Repository;
@Repository
public class ShopDaoImpl extends BaseDaoImpl<Goods> implements ShopDao{

	@Override
	public List<Goods> shopall(String sql) {
		List<Goods> list = super.select(sql);
		return list;
	}

	@Override
	public List<Goods> shopalls(String sql) {
		List<Goods> lists = super.select(sql);
		return lists;
	}

	@Override
	public void shopNew(Shop shop) {
		
		
	}

	

}
