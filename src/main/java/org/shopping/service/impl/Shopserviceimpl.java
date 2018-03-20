package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.ShopDao;
import org.shopping.pojo.Goods;
import org.shopping.service.ShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Shopserviceimpl implements ShopService{
	
	@Resource
	private ShopDao sd;

	@Override
	public List<Goods> select(String sql) {
		List<Goods> list = sd.shopall(sql);
		return list;
	}

	@Override
	public List<Goods> selects(String sql) {
		List<Goods> lists = sd.shopalls(sql);
		return lists;
	}


}
