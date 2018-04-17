package org.shopping.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.shopping.dao.AddressDao;
import org.shopping.pojo.Address;
import org.shopping.service.AddressService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class AddressServiceImpl implements AddressService{
	
	@Resource
	private AddressDao ad;

	/* (non-Javadoc)
	 * @see org.shopping.service.AddressService#selectAddress(java.lang.String)
	 * 
	 *查询所有收货地址
	 */
	@Override
	public List<Address> selectAddress(String sql) {
		List<Address> addresses = ad.select(sql);
		return addresses;
	}

	/* (non-Javadoc)
	 * @see org.shopping.service.AddressService#selectAddress(java.lang.String)
	 * 
	 *添加收货地址
	 */
	@Override
	public void insertAddress(Address address) {
		ad.save(address);
		
	}

	/* (non-Javadoc)
	 * @see org.shopping.service.AddressService#selectAddress(java.lang.String)
	 * 
	 *删除收货地址
	 */
	@Override
	public void deleteAddress(Integer addressId) {
		ad.delete(addressId);		
	}

	/* (non-Javadoc)
	 * @see org.shopping.service.AddressService#selectAddress(java.lang.String)
	 * 
	 *修改收货地址
	 */
	

	@Override
	public Address selectAddressAid(Integer addressId) {
		Address addresses  = (Address) ad.selectById(addressId);
		return addresses;
	}

	@Override
	public void updateAddress(Address address) {
		ad.saveOrUpdate(address);		
	}

}
