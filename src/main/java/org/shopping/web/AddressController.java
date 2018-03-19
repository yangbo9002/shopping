package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.Address;
import org.shopping.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
	
	@Resource
	private AddressService as;
	
	@RequestMapping("/selectAddress")
	public String fn1(ModelMap map,String sql){
	    sql = "select * from address";
		List<Address> address = as.selectAddress(sql);
		map.put("address",address);
		return "address";
		
	}

}
