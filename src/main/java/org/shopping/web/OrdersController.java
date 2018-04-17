package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.shopping.pojo.OrderGoods;
import org.shopping.pojo.Orders;
import org.shopping.pojo.Users;
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
	public List<OrderGoods> fn1(String key,HttpServletRequest request){
		String sql = null;;
		Integer usersId = ((Users)request.getSession().getAttribute("user")).getUsersId();
		if(key == null || key.equals("")){
			sql = "select og.* from ordergoods og,orders o where og.ordersId=o.orderId and usersId="+usersId;
		} else if(key.equals("1")){
			sql = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.isPay=0 and usersId="+usersId;
		} else if(key.equals("2")){
			sql = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.orderStatus=0 and usersId="+usersId;
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
	public String fn2(ModelMap map,HttpServletRequest request){
		String sq = "select og.* from ordergoods og,orders os,goods go where og.goodsId=go.goodsId and os.orderId=og.ordersId and os.orderStatus=0 and usersId="+((Users)request.getSession().getAttribute("user")).getUsersId();
		List<OrderGoods> oda = os.select(sq);
		map.put("oda", oda);
		
		return "orders";
	} 
	
	@RequestMapping("/addOrder")
	public String fun3(Orders order,String gid,HttpServletRequest request,OrderGoods or){
		HttpSession session = request.getSession();
		Users user = (Users)session.getAttribute("user");
		String sql = "insert into orders(address,goodsMoney,isPay,orderStatus,userName,userPhone,usersId)"
				+" value('"+order.getAddress()+"',"+order.getGoodsMoney()+",0,0,'"+order.getUserName()+"','"+order.getUserPhone()+"',"+user.getUsersId()+");";
		os.save(sql,gid);
		
		return "redirect:/jsp/orders.jsp";
	}
}
