package org.shopping.dao;

import java.util.List;

import org.shopping.pojo.Goods;
import org.shopping.pojo.ShopCarts;

public interface CartsDao extends BaseDao<ShopCarts>{
   List<ShopCarts> getCarts(String sql);//��ѯѭ����ʾ
	List<Object> getObject(String sql);//����ɾ��
	
}
