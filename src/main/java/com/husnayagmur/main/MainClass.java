package com.husnayagmur.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.husnayagmur.config.AppConfig;
import com.husnayagmur.model.User;
import com.husnayagmur.services.LoginService;
import com.husnayagmur.services.UserService;

public class MainClass {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService=context.getBean(UserService.class);
		
		for (User user : userService.getUserList()) {
			System.out.println(user);
		}
		
		LoginService loginService=new LoginService();
		loginService.login();
	
	}

}
