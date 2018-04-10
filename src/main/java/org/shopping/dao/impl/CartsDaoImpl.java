package org.shopping.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.shopping.dao.CartsDao;
import org.shopping.pojo.Carts;
import org.shopping.pojo.ShopCarts;
import org.springframework.stereotype.Repository;


@Repository
public class CartsDaoImpl extends BaseDaoImpl<Carts> implements CartsDao{
	
	
             
	@Resource
	private SessionFactory sf;
	/*
	@Override
	public List<Carts> getCarts(String sql) {//用于自己封装实体类
		Session session = sf.getCurrentSession();
		SQLQuery sq = session.createSQLQuery(sql);
		sq.setResultTransformer(Transformers.aliasToBean(ShopCarts.class));
		List<ShopCarts> list = sq.list();
		return list;
	}

	@Override
	public List<Object> getObject(String sql) {//用于批量删除
		Session session = sf.getCurrentSession();
		SQLQuery sq = session.createSQLQuery(sql);
		List<Object> list = sq.list();
		return list;
	}
	*/

	@Override
	public void update(String sql) {
		Session session = sf.getCurrentSession();
		SQLQuery sq = session.createSQLQuery(sql);
		sq.executeUpdate();
	}
	

}
