package org.shopping.service;

import java.util.List;

import org.shopping.pojo.OrderGoods;
import org.shopping.pojo.Orders;


public interface OrdersService {

	List<OrderGoods> select(String sql);//��ѯ����
	Object selectById(Integer id);//���ݱ�Ų�ѯ��������
	Integer save(String sql,String gid);//��ӻ��޸�
	void delete(Integer id);//ɾ������
}
