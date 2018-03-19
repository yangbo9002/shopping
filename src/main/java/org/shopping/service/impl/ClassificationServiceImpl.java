package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.ClassificationDao;
import org.shopping.pojo.Classification;
import org.shopping.service.ClassificationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClassificationServiceImpl implements ClassificationService{

	@Resource
	private ClassificationDao cd;
	
	@Override
	public List<Classification> select(String sql) {
		List<Classification> list = cd.select(sql);
		return list;
	}

	@Override
	public Classification selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Classification t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
