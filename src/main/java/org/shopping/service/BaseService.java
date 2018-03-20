package org.shopping.service;

import java.util.List;

public interface BaseService<T> {

	List<T> select(String sql);//��ѯ����
	T selectById(Integer id);//���ݱ�Ų�ѯ��������
	void saveOrUpdate(T t);//��ӻ��޸�
	void delete(Integer id);//ɾ������
}
