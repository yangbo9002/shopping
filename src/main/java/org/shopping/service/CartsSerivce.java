package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Carts;
import org.shopping.pojo.ShopCarts;

public interface CartsSerivce {
	
	List<Carts> selectCarts(String sql);
	/*List<ShopCarts> getCarts(String sql);*/
	void deleteGood(Integer goodsId);
	void savaOrUpdate(Carts cart);
	void update(String sql);
}
