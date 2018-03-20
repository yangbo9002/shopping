package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Goods;

public interface ShopService {
	List<Goods> select(String sql);
	List<Goods> selects(String sql);
}
