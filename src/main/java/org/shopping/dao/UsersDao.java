package org.shopping.dao;

import java.util.List;

import org.shopping.pojo.Users;

//Ա�����ӿ�
public interface UsersDao extends BaseDao<Users>{

List<Users> queryell(String sql);	
	
Users selectone(String sql);


}
