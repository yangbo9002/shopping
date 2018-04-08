package org.shopping.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.ShopCarts;
import org.shopping.service.CartsSerivce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/shopcartsr")
public class CarteController {

	@Resource
	private CartsSerivce cs;
	
	
	@RequestMapping("/show")
	public String showcarts(){	
		return "carts";
		
	}
	
	@RequestMapping("/selectCarte")
	@ResponseBody
	public List<List<ShopCarts>> getcarys(Integer usersId){
		String sql = "select s.shopId,g.goodsId,g.goodsImg,g.goodsName,g.createTime,a.attrName,att.attrVal,s.shopName,c.cartNum,c.cartId,g.shopPrice  "
				+ " from carts c,goods g,attribures a,attriburesval att,shop s "
				+ " where c.cartId=g.goodsId and a.attrId=att.valId and s.shopId=g.shopId and c.usersId="+usersId+" order by createTime desc";
		/*String sql = "select * from users where usersId="+usersId;*/
		List<ShopCarts> carts = cs.getCarts(sql);
		
		List<Integer> arrayList = new ArrayList<>();//店铺集合
		
		for (ShopCarts shopCarts : carts) {//循环遍历店铺
			if (!arrayList.contains(shopCarts.getShopId())) {
				arrayList.add(shopCarts.getShopId());
			}
		}
		
		List<List<ShopCarts>> arrayList2 = new ArrayList<>();
		
		for(int i=0;i<arrayList.size();i++){
			List<ShopCarts> arrayList3 = new ArrayList<>();
			for (int j = 0; j < carts.size(); j++) {
				ShopCarts sc=null;
				if (arrayList.get(i) == carts.get(j).getShopId()) {
					sc=new ShopCarts();
					sc.setShopId(carts.get(j).getShopId());//店铺id
					sc.setShopName(carts.get(j).getShopName());//店铺名称
					sc.setGoodsId(carts.get(j).getGoodsId());//商品ID
					sc.setAttrName(carts.get(j).getAttrName());//商品属性名称
					sc.setAttrVal(carts.get(j).getAttrVal());//商品属性值
					sc.setCartId(carts.get(j).getCartId());//购物车ID
					sc.setCartNum(carts.get(j).getCartNum());//商品数量
					sc.setCreateTime(carts.get(j).getCreateTime());//添加时间
					sc.setGoodsImg(carts.get(j).getGoodsImg());//商品图片
					sc.setShopPrice(carts.get(j).getShopPrice());//商品单价
					sc.setGoodsName(carts.get(j).getGoodsName());//商品名称
					
					arrayList3.add(sc);
					
				}
			}
			arrayList2.add(arrayList3);
		}
		
		return arrayList2;
		
	}
	@RequestMapping("/deleteCarts")
	public String deleteCarts(Integer goodsId){
		System.out.println("删除商品");
		cs.deleteGood(goodsId);
		return "carts";
	}
	
}
