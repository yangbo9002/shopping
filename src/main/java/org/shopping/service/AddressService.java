package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Address;

public interface AddressService{
	//²éÑ¯
	List<Address> selectAddress(String sql);
	//Ìí¼Ó
	void insertAddress(Address address);
	//É¾³ý
	void deleteAddress(Integer addressId);
	//ÐÞ¸Ä
	Address  selectAddressAid(Integer addressId);
	void updateAddress(Address address);

}
