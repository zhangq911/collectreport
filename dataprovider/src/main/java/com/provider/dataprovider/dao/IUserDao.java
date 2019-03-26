package com.provider.dataprovider.dao;

import com.provider.dataprovider.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserDao {

	public List<User> getUserByPage(Map<String,Object> params);

	public int getUserByTotal();
}
