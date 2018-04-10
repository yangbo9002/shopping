package org.shopping.dao;

import org.shopping.pojo.Logistics;

public interface LogisticsDao {
	void ShopSelling(Logistics logistics);//卖出商品后新增物流单
}
