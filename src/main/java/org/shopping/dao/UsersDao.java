package org.shopping.dao;

import java.util.List;

import org.shopping.pojo.Users;

//员工到接口
public interface UsersDao extends BaseDao<Users>{

List<Users> queryell(String sql);	
	
Users selectone(String sql);


}
