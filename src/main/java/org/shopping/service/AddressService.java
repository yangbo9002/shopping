package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Address;

public interface AddressService{
	//��ѯ
	List<Address> selectAddress(String sql);
	//���
	Address insertAddress(Address address);
	//ɾ��
	Address deleteAddress(Integer aid);
	//�޸�
	Address updateAddress(Address address);

}
