package org.shopping.dao;


import org.shopping.pojo.Carts;

public interface CartsDao extends BaseDao<Carts>{
   /*List<ShopCarts> getCarts(String sql);//��ѯѭ����ʾ
	List<Object> getObject(String sql);//����ɾ��
*/	
	void update(String sql);
}
