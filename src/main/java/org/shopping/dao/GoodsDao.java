package org.shopping.dao;

import java.util.List;

import org.shopping.pojo.Goods;

public interface GoodsDao extends BaseDao<Goods>{
	 List<Goods> shopall(String sql);//ͨ����ǰ�û������ң�ID��ͼ����ʱ��ѯ����������Ϣ
	 List<Goods> shopalls(String sql);//ͨ����ǰ��ƷID�������ʱ��ѯ���е�����Ϣ
	void ShopSelling(Goods goods);//������Ʒ����ٿ��
}
