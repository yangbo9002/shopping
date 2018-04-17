package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.shopping.pojo.Carts;
import org.shopping.pojo.Goods;
import org.shopping.pojo.Users;
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
	public List<Carts> getcarys(String usersId){
		String sql = "select * from carts where usersId="+usersId;
		List<Carts> list = cs.selectCarts(sql);
		return list;
		
		
		
		
		
		/*String sql = "select * from users where usersId="+usersId;
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
					sc.setGoodsInfo(carts.get(j).getGoodsInfo());//��Ʒ����
					
					arrayList3.add(sc);
					
				}
			}
			arrayList2.add(arrayList3);
		}
		
		return arrayList2;*/
		
	}
	@RequestMapping("/deleteCarts")
	public String deleteCarts(Integer cartsId){
		
		cs.deleteGood(cartsId);
		return "carts";
	}
	
	@RequestMapping("/addCarts")
	public String addCarts(Goods good,HttpServletRequest request){
		HttpSession session = request.getSession();
		Users user = (Users)session.getAttribute("user");
		Carts cart = new Carts();
		cart.setCartNum(1);
		cart.setUser(user);
		cart.setGood(good);
		cs.savaOrUpdate(cart);
		return "carts";
	}
	
	@RequestMapping("/addNum")
	@ResponseBody
	public String addNum(String cartId,String cartNum){
		String sql = "update carts set cartNum="+cartNum+" where cartId="+cartId;
		cs.update(sql);
		/*Carts cart = new Carts();
		cart.setCartId(Integer.valueOf(cartId));
		cart.setCartNum(Integer.valueOf(cartNum));
		cs.savaOrUpdate(cart);*/
		return "{status:ok}";
	}
}

