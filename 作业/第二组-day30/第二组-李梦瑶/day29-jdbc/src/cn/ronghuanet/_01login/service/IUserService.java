package cn.ronghuanet._01login.service;

import cn.ronghuanet._01login.domain.User;

public interface IUserService {
	public boolean loginByUser(User u);
	public boolean loginByUserName(User u);
	public boolean loginByPst(User u);

}
