package org.shopping.dao;


import org.shopping.pojo.Carts;

public interface CartsDao extends BaseDao<Carts>{
   /*List<ShopCarts> getCarts(String sql);//查询循环显示
	List<Object> getObject(String sql);//批量删除
*/	
	void update(String sql);
}
