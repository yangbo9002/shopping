package org.shopping.service;

import java.util.List;


public interface OrdersService {

	List<Object> select(String sql);//��ѯ����
	Object selectById(Integer id);//���ݱ�Ų�ѯ��������
	void saveOrUpdate(Object obj);//��ӻ��޸�
	void delete(Integer id);//ɾ������
}
