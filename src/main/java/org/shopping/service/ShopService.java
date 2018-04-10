package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Goods;
import org.shopping.pojo.Logistics;
import org.shopping.pojo.Orders;
import org.shopping.pojo.Shop;

public interface ShopService {
	List<Goods> select(String sql);
	List<Goods> selects(String sql);
	Goods selectById(Integer id);
	void shopNew(Shop shop);
	void ShopSelling(Goods goods,Orders orders,Logistics logistics);
}
