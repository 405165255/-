package cn.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.test.entity.Phone;
import cn.test.mapper.PhoneMapper;

@Service
public class PhoneServiceImpl implements PhoneService{
	
	@Autowired
	private PhoneMapper phoneMapper;
	
	public List<Phone> findAll(int currentPage,int size) {
		PageHelper.startPage(currentPage, size);
		List<Phone> all = phoneMapper.getAll();
		return all;
	}

}
