package cn.test.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import cn.test.entity.Phone;



//@Mapper 启动类有扫描@MapperScan
public interface PhoneMapper {
	
	//public Page<Phone> findAll();
	public List<Phone> getAll();
	
	public List<Phone> select(Phone phone);
	
	public List<Phone> selectAll(Map<String,Object> map);
	
	public int insertList(List<Phone> list);
	
	public Map<String,Object> count();
	
}
