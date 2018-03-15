package org.shopping.dao;

import java.util.List;

/**
 * @author Administrator
 *
 * @param <T>
 * 基础接口  只有常用的几个方法
 */
public interface BaseDao<T> {
	List<T> select(String sql);//查询方法
	T selectById(Integer id);//根据编号查询单个对象
	void saveOrUpdate(T t);//添加或修改
	void delete(Integer id);//删除方法
}
