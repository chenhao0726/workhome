package cn.ronghuanet._01login.controller;

import org.junit.Test;

import cn.ronghuanet._01login.domain.User;
import cn.ronghuanet._01login.service.IUserService;
import cn.ronghuanet._01login.service.impl.UserServiceImpl;

public class UserController {
	private IUserService service = new UserServiceImpl();
	@Test 
	public void loginByUser() {
		boolean loginByUser = service.loginByUser(new User("zs", "1234 or 1=1"));
		System.out.println(loginByUser?"登录成功":"登录失败");
	}
	@Test
	public void loginByUserName() {
		boolean loginByUser = service.loginByUser(new User("zs", "1233"));
		System.out.println(loginByUser?"登录成功":"登录失败");
		
	}
	@Test
	public void loginByPst() {
//		"select * from t_user where name = 'zs' and password='1234 or 1=1'"
		boolean loginByUser = service.loginByPst(new User("zs", "1234 or 1=1"));
		System.out.println(loginByUser?"登陆成功":"登陆失败");
	}

}
