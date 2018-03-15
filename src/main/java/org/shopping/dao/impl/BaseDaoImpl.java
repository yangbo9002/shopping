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
 * ʵ�ֻ���dao�ӿ�   ��д����dao�ӿڵķ���
 */
public class BaseDaoImpl<T> implements BaseDao<T>{
	
	@Resource
	private SessionFactory sf;//hibernate���Ķ���
	private Class<T> cla;//���͵�class����
	
	public BaseDaoImpl() {
		//��̬��ȡ���͵�class����ʵ��hibernate�����Ĵ���
		Type type = getClass().getGenericSuperclass();
		cla = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
	}
	
	/* (non-Javadoc)
	 * @see org.shopping.dao.BaseDao#select(java.lang.String)
	 * ʵ�ֽӿڲ�ѯ����
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
	 * ʵ�ֽӿڲ�ѯ��������
	 */
	@Override
	public T selectById(Integer id) {
		Session session = sf.getCurrentSession();
		T t = session.get(cla, id);
		return t;
	}

	/* (non-Javadoc)
	 * @see org.shopping.dao.BaseDao#saveOrUpdate(java.lang.Object)
	 * ʵ�ֽӿ���Ӻ��޸ķ���
	 */
	@Override
	public void saveOrUpdate(T t) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(t);
	}

	/* (non-Javadoc)
	 * @see org.shopping.dao.BaseDao#delete(java.lang.Integer)
	 * ʵ�ֽӿ�ɾ������
	 */
	@Override
	public void delete(Integer id) {
		Session session = sf.getCurrentSession();
		T t = session.get(cla, id);
		session.delete(t);
	}

}
