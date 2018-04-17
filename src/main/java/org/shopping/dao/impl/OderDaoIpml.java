package org.shopping.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shopping.dao.OrderDao;
import org.shopping.pojo.Orders;
import org.springframework.stereotype.Repository;
@Repository
public class OderDaoIpml extends BaseDaoImpl<Orders> implements OrderDao{

	@Resource
	private SessionFactory sf;//hibernateºËÐÄ¶ÔÏó
	
	@Override
	public void save(String sql) {
		Session session = sf.getCurrentSession();
		SQLQuery sq = session.createSQLQuery(sql);
		sq.executeUpdate();
	}

	@Override
	public Orders selectBy(String sql) {
		Session session = sf.getCurrentSession();
		SQLQuery sq = session.createSQLQuery(sql).addEntity(Orders.class);
		Object or = sq.uniqueResult();
		return (Orders)or;
	}

}
