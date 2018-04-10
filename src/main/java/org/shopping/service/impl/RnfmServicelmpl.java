package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.RnfmDao;
import org.shopping.pojo.Goods;
import org.shopping.service.RnfmService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RnfmServicelmpl implements RnfmService{

	@Resource
	private RnfmDao rd;


	@Override
	public void rnfmNew(Goods goods) {
		rd.saveOrUpdate(goods);
		
	}

	@Override
	public List<Goods> insert(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* (non-Javadoc)
	 * @see org.shopping.service.RnfmService#selsctShop(java.lang.String)
	 * 
	 * 查詢顯示所有商品
	 */
	@Override
	public List<Goods> selsctShop(String sql) {
		List<Goods> list = rd.select(sql);
		return list;
	}


	
	
}
