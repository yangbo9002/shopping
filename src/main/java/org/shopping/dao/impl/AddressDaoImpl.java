package org.shopping.dao.impl;



import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shopping.dao.AddressDao;
import org.shopping.pojo.Address;
import org.springframework.stereotype.Repository;
@Repository
public class AddressDaoImpl extends BaseDaoImpl<Address> implements AddressDao{

	@Resource
	private SessionFactory sf;//hibernateºËÐÄ¶ÔÏó

	@Override
	public void save(Address add) {
		Session session = sf.getCurrentSession();
		//session.saveOrUpdate(add);
		SQLQuery sq = session.createSQLQuery("insert into address(address,isDefault,uname,usersPhone,usersId) value('"+add.getAddress()+"',0,'"+add.getUname()+"','"+add.getUsersPhone()+"',1)");
		sq.executeUpdate();
	}
	
	

}
