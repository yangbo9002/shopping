package org.shopping.dao;

import java.util.List;

public interface PageBean<T> {

	long getCount();//����ܼ�¼��
	List<T> PageSelect(T t);//��ѯ��ʾÿҳ��������¼���뼯��
	
	
}
