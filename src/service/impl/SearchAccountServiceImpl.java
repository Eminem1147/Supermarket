package service.impl;

import java.util.List;

import dao.SearchAccountDao;
import entity.Account;
import service.SearchAccountService;

public class SearchAccountServiceImpl implements SearchAccountService {

	private SearchAccountDao searchAccountDao = null;
	
	public SearchAccountDao getSearchAccountDao() {
		return searchAccountDao;
	}

	public void setSearchAccountDao(SearchAccountDao searchAccountDao) {
		this.searchAccountDao = searchAccountDao;
	}

	@Override
	public List<Account> getAllAccount() {
		return searchAccountDao.getAllAccount();
	}
	
}
