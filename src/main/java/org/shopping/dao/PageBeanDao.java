package org.shopping.dao;

import java.util.List;



public interface PageBeanDao<T> {

	long  getCount();//获得总记录数
	List<T> PageSelect();//查询显示每页多少条记录存入集合
	
	
}
