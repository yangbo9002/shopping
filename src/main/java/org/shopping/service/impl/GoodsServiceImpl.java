package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.AttriburesDao;
import org.shopping.dao.ClassificationDao;
import org.shopping.dao.GoodsDao;
import org.shopping.pojo.Attribures;
import org.shopping.pojo.Classification;
import org.shopping.pojo.Goods;
import org.shopping.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsDao gs;//商品功能对象
	@Resource
	private AttriburesDao ad;//属性功能对象
	@Resource
	private ClassificationDao cd;//分类功能对象
	
	
	/* (non-Javadoc)
	 * @see org.shopping.service.GoodsService#select(java.lang.String)
	 * 查詢商品
	 */
	@Override
	public List<Goods> select(String sql) {
		List<Goods> list = gs.select(sql);
		return list;
	}

	/* (non-Javadoc)
	 * @see org.shopping.service.GoodsService#selectAttr(java.lang.String)
	 * 查詢商品屬性
	 */
	@Override
	public List<Attribures> selectAttr(String sql){
		List<Attribures> list = ad.select(sql);
		return list;
	}
	
	@Override
	public Goods selectById(Integer id) {
		
		return null;
	}

	

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.shopping.service.GoodsService#selectByKey(java.lang.String, java.lang.String, java.lang.String)
	 * 模糊查询
	 */
	@Override
	public List<Goods> selectByKey(String sql, String str, String key) {
		//如果str是0则根据商品模糊查询，str时候1根据店铺查询
		if(str.equals("0")){
			sql += " and goodsInfo like '%"+key+"%'";
		}
		if(str.equals("1")){
			sql += " and shopId=(select shopId from shop where shopName like '%"+key+"%')";
		}
		List<Goods> list = gs.select(sql);
		return list;
	}

	@Override
	public void savaOrUpdate(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Classification> selectCation(String sql) {
		List<Classification> list = cd.select(sql);
		return list;
	}

	
}
