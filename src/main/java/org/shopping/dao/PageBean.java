package org.shopping.dao;

import java.util.List;

public interface PageBean<T> {

	long getCount();//获得总记录数
	List<T> PageSelect(T t);//查询显示每页多少条记录存入集合
	
	
}
