package cn.ronghuanet._03transfer.controller;

import java.math.BigDecimal;

import org.junit.Test;

import cn.ronghuanet._03transfer.dao.IAccountDao;
import cn.ronghuanet._03transfer.dao.impl.AccountDaoImpl;
import cn.ronghuanet._03transfer.domain.Account;
import cn.ronghuanet._03transfer.service.IAccountService;
import cn.ronghuanet._03transfer.service.impl.AccountServiceImpl;

public class AccountController {
	private IAccountDao dao = new AccountDaoImpl();
	private IAccountService service = new AccountServiceImpl();
	
	@Test
	public void getById() {
		Account queryById = dao.queryById(11L);
		System.out.println(queryById);
	}
	@Test
	public void transferDao() {
		Account out = dao.queryById(1L);
		Account in = dao.queryById(2L);
		boolean transfer = dao.transfer(out, in, new BigDecimal(500));
		System.out.println(transfer);
		
	}
	@Test
	public void transfer() {
		Account out = dao.queryById(1L);
		Account in = dao.queryById(2L);
		String transfer = service.transfer(out, in, new BigDecimal(500));
		System.out.println(transfer);
		
	}
}

