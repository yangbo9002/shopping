package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.GoodsDao;
import org.shopping.dao.LogisticsDao;
import org.shopping.dao.OrderDao;
import org.shopping.dao.OrdersDao;
import org.shopping.dao.ShopDao;
import org.shopping.pojo.Goods;
import org.shopping.pojo.Logistics;
import org.shopping.pojo.Orders;
import org.shopping.pojo.Shop;
import org.shopping.service.ShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Shopserviceimpl implements ShopService{
	
	@Resource
	private ShopDao sd;
	@Resource
	private GoodsDao gd;
	@Resource
	private OrderDao od;
	@Resource
	private LogisticsDao ld;
	

	@Override
	public List<Goods> select(String sql) {
		List<Goods> list = gd.shopall(sql);
		return list;
	}

	@Override
	public List<Goods> selects(String sql) {
		List<Goods> lists = gd.shopalls(sql);
		return lists;
	}
	@Override
	public void shopNew(Shop shop) {
		sd.ShopNew(shop);
	}

	@Override
	public void ShopSelling(Goods goods, Orders orders, Logistics logistics) {
		gd.ShopSelling(goods);
		
		ld.ShopSelling(logistics);
		
	}

	@Override
	public Goods selectById(Integer id) {
		Goods good = gd.selectById(id);
		return good;
	}



}
