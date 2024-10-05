package com.husnayagmur.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.husnayagmur.model.User;
import com.husnayagmur.services.UserService;

@Configuration
public class AppConfig {

	@Bean
	public UserService userService() {
		UserService userService=new UserService();
		List<User> userList=new ArrayList<>();
		userList.add(new User("Husna"));
		userList.add(new User("Yagmur"));
		
		userService.setUserList(userList);
		return userService;
	}
}
