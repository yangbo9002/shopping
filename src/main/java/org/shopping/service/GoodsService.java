package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Attribures;
import org.shopping.pojo.Classification;
import org.shopping.pojo.Goods;

public interface GoodsService{
	List<Goods> select(String sql);//查询商品方法
	List<Classification> selectCation(String sql);//查询商品方法
	List<Attribures> selectAttr(String sql);//查询屬性方法
	Object selectById(Integer id);//根据编号查询单个对象
	void savaOrUpdate(Object obj);//添加和修改方法
	void delete(Integer id);//删除方法
	List<Goods> selectByKey(String sql,String str,String key);//str表示根据商品还是店铺查询    key关键字
	
}
