package cn.test.service;

import java.util.List;

import cn.test.entity.Phone;

public interface PhoneService {
	
	List<Phone> findAll(int currentPage,int size);
}
