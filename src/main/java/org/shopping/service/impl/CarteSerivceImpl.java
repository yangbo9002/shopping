package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.CartsDao;
import org.shopping.pojo.Carts;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarteSerivceImpl {

	@Resource
	private CartsDao cd;
	
	public List<Carts> selectCarte(String sql){
		List<Carts> list = cd.select(sql);
		
		return list;
	}
	
}
