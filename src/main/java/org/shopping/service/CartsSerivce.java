package org.shopping.service;

import java.util.List;

import org.shopping.pojo.ShopCarts;

public interface CartsSerivce {
	
	List<ShopCarts> getCarts(String sql);
	void deleteGood(Integer goodsId);
	
}
