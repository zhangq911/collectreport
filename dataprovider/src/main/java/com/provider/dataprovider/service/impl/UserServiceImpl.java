package com.provider.dataprovider.service.impl;

import com.provider.dataprovider.dao.IUserDao;
import com.provider.dataprovider.entity.User;
import com.provider.dataprovider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> getUserByPage(Map<String, Object> paramMap) {
		return userDao.getUserByPage(paramMap);
	}
	@Override
	public int getUserByTotal() {
		return userDao.getUserByTotal();
	}

}
