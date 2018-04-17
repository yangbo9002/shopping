package org.shopping.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.shopping.pojo.Goods;
import org.shopping.pojo.Logistics;
import org.shopping.pojo.Orders;
import org.shopping.pojo.Shop;
import org.shopping.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="/shop")
public class ShopController {
	
	@Resource
	private ShopService ss;
	
	@RequestMapping("/userid")
	//通过当前用户ID（卖家）查询自己的店铺信息
	public String shopall(Integer userId,ModelMap map){
		String sql="select * from goods where shopId=(select shopId from shop where usersId="+userId+")";
		List<?> ssl = ss.select(sql);
		map.put("ssl", ssl);
		return "list";
	}
	@RequestMapping("/GoodId")
	//通过当前商品ID查询商品所在店铺信息

	public String shopalls(Integer goodsId,ModelMap map){
		Goods good = ss.selectById(goodsId);
		map.put("ssl", good);
		return "list";
	}
	public List<Goods> shopalls(Integer goodsId){
		String sql="select * from goods where shopId=(select sho	+pId.shopId from Goods where goodsId="+goodsId+")";
		List<Goods> list = ss.selects(sql);
		return list;

	}

	@RequestMapping(value="/New")
	//用户新建自己的店铺
	public String shopNew(Shop shop){
		ss.shopNew(shop);
		return "index";
	}

	@RequestMapping("/News")
	//卖出一件商品是修改库存，增加订单，增加物流
	public String ShopSelling(Goods goods, Orders orders, Logistics logistics){
		ss.ShopSelling(goods, orders, logistics);
		return "Y";
	}
	
	
	
}
