package org.shopping.dao;

import org.shopping.pojo.Address;

public interface AddressDao extends BaseDao<Address>{
	void save(Address add);
}
