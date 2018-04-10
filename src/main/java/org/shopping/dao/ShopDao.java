package org.shopping.dao;


import org.shopping.pojo.Shop;

public interface ShopDao extends BaseDao<Shop>{
		
	 void ShopNew(Shop shop);//新开店铺   添加一条店铺信息
}
