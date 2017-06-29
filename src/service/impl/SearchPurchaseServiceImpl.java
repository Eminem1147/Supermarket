package service.impl;

import java.util.List;

import dao.SearchPurchaseDao;
import entity.Purchase;
import service.SearchPurchaseService;

public class SearchPurchaseServiceImpl implements SearchPurchaseService {

	private SearchPurchaseDao searchPurchaseDao = null;
	
	public SearchPurchaseDao getSearchPurchaseDao() {
		return searchPurchaseDao;
	}

	public void setSearchPurchaseDao(SearchPurchaseDao searchPurchaseDao) {
		this.searchPurchaseDao = searchPurchaseDao;
	}
	
	@Override
	public List<Purchase> getAllPurchase() {
		return searchPurchaseDao.getAllPurchase();
	}

}
