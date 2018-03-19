package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Shop;

public interface ShopService {
	List<Shop> select(String sql);
}
