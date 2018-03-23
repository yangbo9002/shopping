package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Attribures;
import org.shopping.pojo.Classification;
import org.shopping.pojo.Goods;

public interface GoodsService{
	List<Goods> select(String sql);//��ѯ��Ʒ����
	List<Classification> selectCation(String sql);//��ѯ��Ʒ����
	List<Attribures> selectAttr(String sql);//��ѯ���Է���
	Object selectById(Integer id);//���ݱ�Ų�ѯ��������
	void savaOrUpdate(Object obj);//��Ӻ��޸ķ���
	void delete(Integer id);//ɾ������
	List<Goods> selectByKey(String sql,String str,String key);//str��ʾ������Ʒ���ǵ��̲�ѯ    key�ؼ���
	
}
