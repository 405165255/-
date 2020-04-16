package cn.test.mapper;

import java.util.List;

import cn.test.entity.User;

public interface UserMapper {
	
	int insert(User user);
	
	List<User> findAll();
}
