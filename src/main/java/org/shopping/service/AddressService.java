package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Address;

public interface AddressService{
	//²éÑ¯
	List<Address> selectAddress(String sql);
	//Ìí¼Ó
	void insertAddress(Address address);
	//É¾³ı
	void deleteAddress(Integer addressId);
	//ĞŞ¸Ä
	Address updateAddress(Address address);

}
