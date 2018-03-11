package com.service;

public interface ILoginService {
	boolean Login(String UserName,String Password);
	void Logout(String UserName);
	void ChangePassword(String UserName,String OldPassword,String NewPassword);
}
