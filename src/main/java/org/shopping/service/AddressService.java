package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Address;

public interface AddressService{
	//²éÑ¯
	List<Address> selectAddress(String sql);
	//Ìí¼Ó
	Address insertAddress(Address address);
	//É¾³ı
	Address deleteAddress(Integer aid);
	//ĞŞ¸Ä
	Address updateAddress(Address address);

}
