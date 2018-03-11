package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.model.User;
import com.model.UserExample;
import com.model.UserExample.Criteria;
import com.service.ILoginService;

@Service("loginService")
public class LoginService implements ILoginService{

	@Resource
	private UserMapper userDao;
	
	/**
	 * 用户登录
	 */
	public boolean Login(String UserName, String Password) {
		boolean result = false;
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(UserName);
		criteria.andPasswordEqualTo(Password);
		List<User> users = userDao.selectByExample(example);
		System.out.println(users);
		System.out.println(users.size());
		result = users.size()>0;
		return result;
	}

	@Override
	public void Logout(String UserName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ChangePassword(String UserName, String OldPassword, String NewPassword) {
		// TODO Auto-generated method stub
		
	}

}
