package org.shopping.dao.impl;




import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shopping.dao.RnfmDao;
import org.shopping.pojo.Goods;
import org.springframework.stereotype.Repository;

@Repository
public class RnfmDaolmpl extends BaseDaoImpl<Goods> implements RnfmDao{

	@Resource
	private SessionFactory sf;//hibernateºËÐÄ¶ÔÏó

	@Override
	public List<Goods> insert(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*@Override
	public List<Goods> insert(Goods goods) {
		Session session = sf.getCurrentSession();
		session.
		return null;
	}*/

	
}
