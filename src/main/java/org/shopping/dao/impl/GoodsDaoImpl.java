package org.shopping.dao.impl;

import java.util.List;

import org.shopping.dao.GoodsDao;
import org.shopping.pojo.Goods;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDaoImpl extends BaseDaoImpl<Goods> implements GoodsDao{

	
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
	public void ShopSelling(Goods goods) {
			super.saveOrUpdate(goods);	
	}
	
}
