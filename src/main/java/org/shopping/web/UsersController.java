package org.shopping.web;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.shopping.pojo.Users;
import org.shopping.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@RequestMapping("user")
public class UsersController {

@Resource	
private UsersService es;

@RequestMapping("/login")
public String login(String loginName,String loginPwd,HttpServletRequest request,HttpServletResponse re){//µÇÂ¼
	String result="";

	System.out.println(loginName);
	Users users =es.selectOne(loginName,loginPwd);
	
	HttpSession session = request.getSession();
	
	if (users!=null&&loginName!=null&&!loginName.equals("")&&loginPwd!=null&&!loginPwd.equals("")) {
		session.setAttribute("user", users);
		result="../index";
	} else {
		result="bb";
	} 
	return result;
}
@RequestMapping("/zhuc")
public String zhuce(Users users){//×¢²á
	es.addUsers(users);
	return "Login";
}
}

