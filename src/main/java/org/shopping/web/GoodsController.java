package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.service.impl.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Resource
	private TestService tes;
	
	@RequestMapping("/test")
	@ResponseBody
	public List<?> fun(){
		String sql = "select * from goods;";
		List<?> list = tes.select(sql);
		return list;
		
	}
}
