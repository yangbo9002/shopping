package org.shopping.web;

import javax.annotation.Resource;

import org.shopping.pojo.PageBean;
import org.shopping.service.impl.PageSerivceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController<T> {

	@Resource
	private PageSerivceImpl<T> ps;
	
	
	// µÃÂ¿‡
	PageBean<T> pb = new PageBean<>();
	
	@RequestMapping("selectPage")
	public String selectPage(ModelMap map){
		
		
		
		return null;
		
		
	}
}
