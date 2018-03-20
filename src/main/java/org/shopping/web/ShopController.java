package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.Goods;
import org.shopping.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Resource
	private ShopService ss;
	
	@ResponseBody
	@RequestMapping("/userid")
	//ͨ����ǰ�û�ID�����ң���ѯ�Լ��ĵ�����Ϣ
	public List<Goods> shopall(Integer userId){
		String sql="select * from goods where shopId=(select shopId from shop where usersId="+userId+")";
		List<Goods> list = ss.select(sql);
		return list;
	}
	@ResponseBody
	@RequestMapping("/GoodId")
	//ͨ����ǰ��ƷID��ѯ��Ʒ���ڵ�����Ϣ
	public List<Goods> shopalls(Integer goodsId){
		String sql="select * from goods where shopId=(select shopId.shopId from Goods where goodsId="+goodsId+")";
		List<Goods> list = ss.selects(sql);
		return list;
	}
	
	
	
}
