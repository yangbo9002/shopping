package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Resource
	private GoodsService gs;
	
	@RequestMapping("/qury")
	@ResponseBody
	public List<?> fun(){
		String sql = "select * from goods;";
		List<?> list = gs.select(sql);
		return list;
		
	}
}
