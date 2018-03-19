package org.shopping.web;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.pojo.Users;
import org.shopping.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UsersController {

	@Resource
	private UsersService us;
	
	@RequestMapping("/query")
	@ResponseBody
	public List<Users> fun(){
		String sql = "select * from users;";
		List<Users> list = us.select(sql);
		return list;
	}
}
