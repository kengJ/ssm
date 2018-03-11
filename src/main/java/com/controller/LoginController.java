package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.ILoginService;

@Controller
@RequestMapping("/Login")
public class LoginController {

	@Resource
	private ILoginService loginService;
	
	@RequestMapping("/Login")
	@ResponseBody
	public boolean Login(String UserName,String Password){
		System.out.println("UserName:"+UserName+" Password:"+Password);
		boolean result = loginService.Login(UserName, Password);
		return result;
	}
}
