package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Address;

public interface AddressService{
	//��ѯ
	List<Address> selectAddress(String sql);
	//���
	void insertAddress(Address address);
	//ɾ��
	void deleteAddress(Integer addressId);
	//�޸�
	Address  selectAddressAid(Integer addressId);
	void updateAddress(Address address);

}
