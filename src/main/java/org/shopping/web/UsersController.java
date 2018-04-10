package org.shopping.web;





import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.shopping.pojo.Users;
import org.shopping.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;




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
public String zhuce(Users users,HttpServletRequest request,MultipartFile mFile)throws IOException{//×¢²á
	if (!mFile.isEmpty()) {
		String fileName = mFile.getOriginalFilename();
		int starIndex = fileName.lastIndexOf(".");
		String fileSuffix = fileName.substring(starIndex);
		String filePath = request.getSession().getServletContext().getRealPath("images");
		File file = new File(filePath,fileName);
		/*String eurl = filePath+"img/" + System.currentTimeMillis() + fileSuffix;*/
		String userPhoto = "images/"+mFile + fileName;
		users.setUserPhoto(userPhoto);
		/*FileUtils.copyInputStreamToFile(mFile.getInputStream(), new File(eurl));*/
	}	
	es.addUsers(users);
	return "Login";
}
}

