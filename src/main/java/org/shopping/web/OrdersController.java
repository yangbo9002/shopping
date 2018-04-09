package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.OrderGoods;
import org.shopping.service.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class OrdersController {
	
	@Resource
	private OrdersService os;
	
	@RequestMapping("selectOrders")	
	@ResponseBody
	public List<OrderGoods> fn1(String key){
		String sql = null;;
		if(key == null || key.equals("")){
			sql = "select * from ordergoods";
		} else if(key.equals("1")){
			sql = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.isPay=0;";
		} else if(key.equals("2")){
			sql = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.orderStatus=0;";
		}
		List<OrderGoods> od = os.select(sql);
		/*map.put("od", od);
		String sq = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.isPay=0;";
		List<OrderGoods> oda = os.select(sq);
		map.put("oda", oda);
		String sqq = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.orderStatus=0;";
		List<OrderGoods> odaa = os.select(sq);
		map.put("odaa", oda);*/
		return od;
	}
	
	@RequestMapping("selectDfh")	
	public String fn2(ModelMap map){
		String sq = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.orderStatus=0;";
		List<OrderGoods> oda = os.select(sq);
		map.put("oda", oda);
		
		return "orders";
	} 
	

}
