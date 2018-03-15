package org.shopping.dao;

import java.util.List;

/**
 * @author Administrator
 *
 * @param <T>
 * �����ӿ�  ֻ�г��õļ�������
 */
public interface BaseDao<T> {
	List<T> select(String sql);//��ѯ����
	T selectById(Integer id);//���ݱ�Ų�ѯ��������
	void saveOrUpdate(T t);//��ӻ��޸�
	void delete(Integer id);//ɾ������
}
