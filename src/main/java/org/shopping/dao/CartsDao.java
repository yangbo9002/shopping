package org.shopping.dao;

import java.util.List;

import org.shopping.pojo.Goods;
import org.shopping.pojo.ShopCarts;

public interface CartsDao extends BaseDao<ShopCarts>{
   List<ShopCarts> getCarts(String sql);//查询循环显示
	List<Object> getObject(String sql);//批量删除
	
}
