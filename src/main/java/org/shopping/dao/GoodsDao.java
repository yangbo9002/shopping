package org.shopping.dao;

import java.util.List;

import org.shopping.pojo.Goods;

public interface GoodsDao extends BaseDao<Goods>{
	 List<Goods> shopall(String sql);//通过当前用户（卖家）ID进图商铺时查询商铺所有信息
	 List<Goods> shopalls(String sql);//通过当前商品ID进入店铺时查询所有店铺信息
	void ShopSelling(Goods goods);//卖出商品后减少库存
}
