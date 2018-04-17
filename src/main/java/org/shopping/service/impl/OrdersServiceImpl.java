package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.OrderDao;
import org.shopping.dao.OrderGoodsDao;
import org.shopping.dao.OrdersDao;
import org.shopping.pojo.Goods;
import org.shopping.pojo.OrderGoods;
import org.shopping.pojo.Orders;
import org.shopping.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional 
public class OrdersServiceImpl implements OrdersService{
	
	@Resource
	private OrdersDao od;
	@Resource
	private OrderDao ood;
	@Resource
	private OrderGoodsDao ogd;

	@Override
	public List<OrderGoods> select(String sql) {
		List<OrderGoods> oGoods = od.select(sql);
		return oGoods;
	}
	
	
	public List<OrderGoods> selectAll(String sql) {
		List<OrderGoods> oGoods = od.select(sql);
		return oGoods;
	}

	@Override
	public Object selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer save(String sql,String gid) {
		ood.save(sql);
		String[]  strs=gid.split(",");
		for(int i=0;i<strs.length;i++){
			String[]  st=strs[i].split("-");
			OrderGoods og = new OrderGoods();
			og.setGoodsNum(Integer.valueOf(st[1]));
			
			og.setOrder(ood.selectBy("select * from orders order by orderId desc limit 0,1"));;
			Goods goods = new Goods();
			goods.setGoodsId(Integer.valueOf(st[0]));
			og.setGoods(goods);
			
			ogd.saveOrUpdate(og);
		}
		return 1;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
