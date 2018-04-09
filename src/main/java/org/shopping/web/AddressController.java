package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;
import javax.tools.JavaFileManager.Location;

import org.shopping.pojo.Address;
import org.shopping.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AddressController {
	
	@Resource
	private AddressService as;
	/**
	 * @author Administrator
	 *查询所有收货地址
	 */
	@RequestMapping("/selectAddress")
	public String fn1(ModelMap map,String sql){
	    sql = "select * from address";
		List<Address> address = as.selectAddress(sql);
		map.put("address",address);
		return "address";		
	}
	/**
	 * @author Administrator
	 *删除收货地址
	 */
	@RequestMapping("/deleteAddress")
	public String  fn2(Integer addressId){
		as.deleteAddress(addressId);
		return "redirect:selectAddress";
	}
	/**
	 * @author Administrator
	 *添加收货地址
	 */
	@RequestMapping("/insertAddres小儿，3")
	public String fn3(Address address){
		as.insertAddress(address);
		return "redirect:selectAddress";
	}
	
	@RequestMapping("/selectAddressId")
	public String fn4(Integer addressId,ModelMap map){
		Address address=as.selectAddressAid(addressId);
		map.put("address", address);
		return "updateAddress";
	}
	
	@RequestMapping("/updateAddress")
	public String fn5(Address 
			address){
		as.updateAddress(address);
		return "redirect:selectAddress";
	}

}
