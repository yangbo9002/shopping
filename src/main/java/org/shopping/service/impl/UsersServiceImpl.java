package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.UsersDao;
import org.shopping.pojo.Users;
import org.shopping.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	@Resource
	private UsersDao ud;
	
	@Override
	public List<Users> select(String sql) {
		List<Users> list = ud.select(sql);
		return list;
	}
	
	
}
