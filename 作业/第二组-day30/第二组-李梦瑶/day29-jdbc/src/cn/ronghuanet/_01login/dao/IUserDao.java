package cn.ronghuanet._01login.dao;

import cn.ronghuanet._01login.domain.User;

public interface IUserDao {
	User getUserByNameAndPwd(User u);
	
	User getUserByName(User u);
	
	User getUserByPst(User u);

}
