package service.impl;

import dao.InsertAccountDao;
import entity.Account;
import service.InsertAccountService;

public class InsertAccountServiceImpl implements InsertAccountService {

	private InsertAccountDao insertAccountDao = null;
	
	public InsertAccountDao getInsertAccountDao() {
		return insertAccountDao;
	}

	public void setInsertAccountDao(InsertAccountDao insertAccountDao) {
		this.insertAccountDao = insertAccountDao;
	}

	@Override
	public int insertAccount(Account account) {
		return insertAccountDao.insertAccount(account);
	}
	
}
