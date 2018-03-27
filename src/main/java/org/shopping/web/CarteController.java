package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.Carts;
import org.shopping.service.impl.CarteSerivceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarteController {

	@Resource
	private CarteSerivceImpl cs;
	
	
	@RequestMapping("selectCarte")
	public String selectCarte(ModelMap map){
		String sql = "select * from carts where usersId=1";
		List<Carts> list = cs.selectCarte(sql);
		map.put("list", list);
		return "carts";
		
	}
}
