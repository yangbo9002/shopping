package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.CartsDao;
import org.shopping.dao.ShopCartsDao;
import org.shopping.pojo.ShopCarts;
import org.shopping.service.CartsSerivce;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarteSerivceImpl implements CartsSerivce{

	@Resource
	private CartsDao cd;
	
	@Resource
	private ShopCartsDao scd;

	@Override
	public List<ShopCarts> getCarts(String sql) {
          List<ShopCarts> list = cd.getCarts(sql);
		
		  return list;
	}

	@Override
	public void deleteGood(Integer goodsId) {
		scd.delete(goodsId);
		
	}
	
	
	
	
}
