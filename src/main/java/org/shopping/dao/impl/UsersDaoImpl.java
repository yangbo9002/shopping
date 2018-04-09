package org.shopping.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shopping.dao.UsersDao;
import org.shopping.pojo.Users;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDaoImpl extends BaseDaoImpl<Users> implements UsersDao{

	@Resource
	private SessionFactory sf;
	
	

	@Override
	public Users selectone(String sql) {
	Session session =sf.getCurrentSession();
	SQLQuery query =session.createSQLQuery(sql).addEntity(Users.class);
		Users users =(Users) query.uniqueResult();
		return users;
	}




 




	@Override
	public List<Users> queryell(String sql) {
	
		return null;
	}


	

}
