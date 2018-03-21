package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.PageBeanDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PageSerivceImpl<T>{

	@Resource
	private PageBeanDao<T> pbd;

	
	/**
	 * @return
	 * 总数量
	 */
	public long getCount(){
		long count = pbd.getCount();
		return count;				
	}
	
	/**
	 * @return
	 * 每页显示多少条记录
	 */
	public List<T> PageSelect(){
		List<T> pageSelect = pbd.PageSelect();
		return pageSelect;
	}
	
}
