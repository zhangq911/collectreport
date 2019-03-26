package com.provider.dataprovider;

import com.provider.dataprovider.service.IUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DataproviderApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Resource
	private IUserService userService1;

	@Test
	public void getUserByPage(){
		Map params = new HashMap();
		List result = userService1.getUserByPage(params);
		System.out.println(result);
	}


}
