package org.shopping.service;

import java.util.List;

import org.shopping.pojo.Users;

public interface UsersService {
List<Users> queryull();
Users selectOne(String longinName,String longinPwd );
void addUsers(Users users);//зЂВс
}
