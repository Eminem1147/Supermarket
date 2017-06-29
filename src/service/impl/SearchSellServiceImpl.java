package service.impl;

import java.util.List;

import dao.SearchSellDao;
import entity.Sell;
import service.SearchSellService;

public class SearchSellServiceImpl implements SearchSellService {

	private SearchSellDao searchSellDao = null;
	
	public SearchSellDao getSearchSellDao() {
		return searchSellDao;
	}

	public void setSearchSellDao(SearchSellDao searchSellDao) {
		this.searchSellDao = searchSellDao;
	}

	@Override
	public List<Sell> getAllSell() {
		return searchSellDao.getAllSell();
	}


}
