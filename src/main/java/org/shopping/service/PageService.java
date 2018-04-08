package org.shopping.service;

import java.util.Map;

public interface PageService<T> {
	public Map<String,Object> query(Integer pageNo,String querySql,String sql);
}
