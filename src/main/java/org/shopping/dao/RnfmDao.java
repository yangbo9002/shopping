package org.shopping.dao;



import java.util.List;

import org.shopping.pojo.Goods;

public interface RnfmDao extends BaseDao<Goods>{
	
	List<Goods> insert(Goods goods);
    
}
