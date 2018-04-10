package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Goods;

public interface RnfmService {
   
	List<Goods> selsctShop(String sql);
	List<Goods> insert(Goods goods);
	void rnfmNew(Goods goods);
	
}
