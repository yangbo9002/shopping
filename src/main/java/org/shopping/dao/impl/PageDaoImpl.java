package org.shopping.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.shopping.dao.PageDao;
import org.springframework.stereotype.Repository;

@Repository
public class PageDaoImpl implements PageDao{

	@Resource
	private SessionFactory sf;
	
	@Override
	public Map<String, Object> query(Integer pageNo,String querySql,String sql,Object obj) {
		Map<String, Object> res= new HashMap<String,Object>();
		//每页显示几条数据
		int pageSize = 5;
		
		Session session = sf.getCurrentSession();
		Query createQuery = session.createQuery(querySql);
		int rows = ((Long) createQuery.iterate().next()).intValue();
	        int pageCount = rows/pageSize  +(rows%pageSize==0? 0 : 1 ) ;
	        res.put("pageCount",pageCount);//封装总页数
	
		//查询数据
		int startNo = (pageNo-1)*pageSize;
		sql += " limit "+startNo+","+pageSize;
		SQLQuery query = session.createSQLQuery(sql);
		 setQueryParameter(query, obj);
		List<Map<String, Object>> list = queryResultToMap(query);
		res.put("datas", list);
		return res;
	}

	private static void setQueryParameter(Query query, Object... args) {
		if (args != null) {
		for (int i = 1, j = args.length; i < j; i++) {
		query.setParameter(i, args[i]);
		}
		}
	}
	private static List<Map<String, Object>> queryResultToMap(Query query) {
		return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
		}

}
