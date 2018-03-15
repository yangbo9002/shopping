package org.shopping.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shopping.dao.BaseDao;

/**
 * @author Administrator
 *
 * @param <T>
 * 实现基础dao接口   重写基础dao接口的方法
 */
public class BaseDaoImpl<T> implements BaseDao<T>{
	
	@Resource
	private SessionFactory sf;//hibernate核心对象
	private Class<T> cla;//泛型的class对象
	
	public BaseDaoImpl() {
		//动态获取泛型的class对象实现hibernate参数的传入
		Type type = getClass().getGenericSuperclass();
		cla = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
	}
	
	/* (non-Javadoc)
	 * @see org.shopping.dao.BaseDao#select(java.lang.String)
	 * 实现接口查询方法
	 */
	@Override
	public List<T> select(String sql) {
		Session session = sf.getCurrentSession();
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(cla);
		return query.list();
	}

	/* (non-Javadoc)
	 * @see org.shopping.dao.BaseDao#selectById(java.lang.Integer)
	 * 实现接口查询单个对象
	 */
	@Override
	public T selectById(Integer id) {
		Session session = sf.getCurrentSession();
		T t = session.get(cla, id);
		return t;
	}

	/* (non-Javadoc)
	 * @see org.shopping.dao.BaseDao#saveOrUpdate(java.lang.Object)
	 * 实现接口添加和修改方法
	 */
	@Override
	public void saveOrUpdate(T t) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(t);
	}

	/* (non-Javadoc)
	 * @see org.shopping.dao.BaseDao#delete(java.lang.Integer)
	 * 实现接口删除方法
	 */
	@Override
	public void delete(Integer id) {
		Session session = sf.getCurrentSession();
		T t = session.get(cla, id);
		session.delete(t);
	}

}
