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
	 * ������
	 */
	public long getCount(){
		long count = pbd.getCount();
		return count;				
	}
	
	/**
	 * @return
	 * ÿҳ��ʾ��������¼
	 */
	public List<T> PageSelect(){
		List<T> pageSelect = pbd.PageSelect();
		return pageSelect;
	}
	
}
