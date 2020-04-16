package cn.test;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

import cn.test.entity.Phone;
import cn.test.entity.Result;
import cn.test.entity.User;
import cn.test.mapper.UserMapper;
import cn.test.service.PhoneService;

@RestController
public class TestController {
	
	@Autowired
	private PhoneService phoneService;
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * http://localhost:3000/list?currentPage=1&size=1
	 * users/getUsers?page=1&pageSize=5
	 * @param currentPage
	 * @param size
	 * @return
	 */
	@GetMapping("/users/getUsers")
	public Result list(@RequestParam(name="page",defaultValue="1") int currentPage,
			@RequestParam(name="pageSize",defaultValue="10")int size){
		Result result = new Result();
		PageHelper.startPage(currentPage, size);
		List<User> list = userMapper.findAll();
		if(!CollectionUtils.isEmpty(list)) {
			result.setCount(list.size());
		}
		result.setUserList(list);
		return result;
	}
	@GetMapping("/hello")
	public String hello(){
		
		return "hello";
	}
	
	@PostMapping("/users/create")
	public Result create(@RequestBody User user) {
		Result result = new Result();
		try {
			boolean is_active = user.isIs_active();
			if(is_active) {
				user.setStatus("1");
			}else {
				user.setStatus("0");
			}
			user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			user.setCreate_time(new Date());
			userMapper.insert(user);
			result.setStatus("0");
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
