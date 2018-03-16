package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.BaseDao;
import org.shopping.dao.GoodsDao;
import org.shopping.dao.impl.BaseDaoImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
	
	@Resource
	private GoodsDao gd;
	
	public List<?> select(String sql){
		List<?> list = gd.select(sql);
		return list;
	}
}
