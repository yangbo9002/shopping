package org.shopping.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.shopping.dao.PageDao;
import org.shopping.pojo.Goods;
import org.shopping.service.PageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PageServiceImpl implements PageService<Goods>{

	@Resource
	private PageDao pd;
	
	@Override
	public Map<String, Object> query(Integer pageNo,String querySql,String sql) {
		Map<String, Object> map = pd.query(pageNo,querySql,sql, new Goods());
		return map;
	}

}
