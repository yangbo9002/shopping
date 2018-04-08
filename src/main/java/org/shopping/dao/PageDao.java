package org.shopping.dao;

import java.util.Map;

public interface PageDao {

	Map<String, Object> query(Integer pageNo, String querySql, String sql,Object obj);
}
