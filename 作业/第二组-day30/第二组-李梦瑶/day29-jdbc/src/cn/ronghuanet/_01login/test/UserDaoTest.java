package cn.ronghuanet._01login.test;

import org.junit.Test;

import cn.ronghuanet._01login.dao.IUserDao;
import cn.ronghuanet._01login.dao.impl.UserDaoImpl;
import cn.ronghuanet._01login.domain.User;

public class UserDaoTest {
	private IUserDao dao = new UserDaoImpl();
	
	@Test
	public void testgetUserByNameAndPwd() {
		User user = dao.getUserByNameAndPwd(new User("li","1234"));
		System.out.println(user);
		
	}
	@Test
	public void testgetUserByName() {
		User user = dao.getUserByName(new User("李勇", "1234"));
		System.out.println(user);
		
	}
	@Test
	public void getUserByPst() {
		User user = dao.getUserByPst(new User("哈哈", "111"));
		System.out.println(user);
	}
	

}
