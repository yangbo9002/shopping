package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Users;

public interface UsersService {
	List<Users> select(String sql);
}
