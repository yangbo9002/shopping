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
		
		List<Integer> arrayList = new ArrayList<>();//���̼���
		
		for (ShopCarts shopCarts : carts) {//ѭ����������
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
					sc.setShopId(carts.get(j).getShopId());//����id
					sc.setShopName(carts.get(j).getShopName());//��������
					sc.setGoodsId(carts.get(j).getGoodsId());//��ƷID
					sc.setAttrName(carts.get(j).getAttrName());//��Ʒ��������
					sc.setAttrVal(carts.get(j).getAttrVal());//��Ʒ����ֵ
					sc.setCartId(carts.get(j).getCartId());//���ﳵID
					sc.setCartNum(carts.get(j).getCartNum());//��Ʒ����
					sc.setCreateTime(carts.get(j).getCreateTime());//���ʱ��
					sc.setGoodsImg(carts.get(j).getGoodsImg());//��ƷͼƬ
					sc.setShopPrice(carts.get(j).getShopPrice());//��Ʒ����
					sc.setGoodsName(carts.get(j).getGoodsName());//��Ʒ����
					
					arrayList3.add(sc);
					
				}
			}
			arrayList2.add(arrayList3);
		}
		
		return arrayList2;
		
	}
	@RequestMapping("/deleteCarts")
	public String deleteCarts(Integer goodsId){
		System.out.println("ɾ����Ʒ");
		cs.deleteGood(goodsId);
		return "carts";
	}
	
}
