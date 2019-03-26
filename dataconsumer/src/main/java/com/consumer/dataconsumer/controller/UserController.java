package com.consumer.dataconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.provider.dataprovider.entity.User;
import com.provider.dataprovider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/all/index")
	public String index (Model model,
						 @RequestParam(value="currentPage", required = false) Integer currentPage) {

		int pageSize = 10;

		if (null == currentPage) {
			currentPage = 1;
		}

		int totalRow = userService.getUserByTotal();

		int totalPage = totalRow / pageSize;
		int left = totalRow % pageSize;

		if (left > 0) {
			totalPage = totalPage + 1;
		}

		int startRow = (currentPage-1) * pageSize;
		Map<String, Object> paramMap = new ConcurrentHashMap<>();
		paramMap.put("startRow", startRow);
		paramMap.put("pageSize", pageSize);

		List<User> userList = userService.getUserByPage(paramMap);

		model.addAttribute("userList", userList);


		return "user";
	}
}
