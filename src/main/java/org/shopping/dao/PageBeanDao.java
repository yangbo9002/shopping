package org.shopping.dao;

import java.util.List;



public interface PageBeanDao<T> {

	long  getCount();//����ܼ�¼��
	List<T> PageSelect();//��ѯ��ʾÿҳ��������¼���뼯��
	
	
}
