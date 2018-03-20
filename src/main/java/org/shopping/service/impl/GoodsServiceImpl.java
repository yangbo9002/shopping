package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.GoodsDao;
import org.shopping.pojo.Goods;
import org.shopping.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsDao gs;
	
	@Override
	public List<Goods> select(String sql) {
		List<Goods> list = gs.select(sql);
		return list;
	}

	@Override
	public Goods selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Goods t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
}
