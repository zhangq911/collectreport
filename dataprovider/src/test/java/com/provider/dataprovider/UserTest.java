package com.provider.dataprovider;

import com.provider.dataprovider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class UserTest extends DataproviderApplicationTests{

	@Autowired
	private IUserService userService;

	public void getUserByPage(){
		Map params = new HashMap();
		System.out.println(userService.getUserByPage(params).get(0));
	}
}
