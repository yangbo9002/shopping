package org.shopping.service;

import java.util.List;

public interface BaseService<T> {

	List<T> select(String sql);//查询方法
	T selectById(Integer id);//根据编号查询单个对象
	void saveOrUpdate(T t);//添加或修改
	void delete(Integer id);//删除方法
}
