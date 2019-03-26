package com.provider.dataprovider.service;

import com.provider.dataprovider.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {

	public List<User> getUserByPage(Map<String, Object> paramMap);

	public int getUserByTotal();

}
