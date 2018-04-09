package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.UsersDao;
import org.shopping.pojo.Users;
import org.shopping.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//员工接口
@Service
@Transactional
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersDao ud;
	
	
	


	@Override
	public Users selectOne(String longinName, String longinPwd) {
		String sql="select * from users where loginName='"+longinName+"'and loginPwd='"+longinPwd+"'";
		Users users =ud.selectone(sql);
		return users;
	}


	@Override
	public List<Users> queryull() {
		
		return null;
	}


	@Override
	public void addUsers(Users users) {
	ud.saveOrUpdate(users);
	}
}
