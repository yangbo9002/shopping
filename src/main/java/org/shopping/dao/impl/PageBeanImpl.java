package org.shopping.dao.impl;

import java.math.BigInteger;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.shopping.dao.PageBeanDao;
import org.shopping.pojo.PageBean;



public class PageBeanImpl<T> implements PageBeanDao<T>{
	
	@Resource
	private SessionFactory sf;

	
	/* (non-Javadoc)
	 * @see org.shopping.dao.PageBeanDao#getCount()
	 * 
	 * 查询总记录数
	 */
	@Override
	public long getCount() {	
		String sql = "select count(*) from carts";
		SQLQuery query = sf.getCurrentSession().createSQLQuery(sql);
		BigInteger count0 = (BigInteger) query.uniqueResult();
	    int count1 = count0.intValue();
	    return count1;
		 
	}

	

	/* (non-Javadoc)
	 * @see org.shopping.dao.PageBeanDao#PageSelect()
	 * 查询每页多少条记录 存入集合
	 */
	@Override
	public List<T> PageSelect() {
		PageBean<T> pb = new PageBean<T>();
		String sql = "select * from carts limit "+(pb.getNowPage()-1)*pb.getNum()+","+pb.getNum()+";";
		SQLQuery sqlQuery = sf.getCurrentSession().createSQLQuery(sql);		
		return sqlQuery.list();
	}

}
