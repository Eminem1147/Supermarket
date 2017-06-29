package service.impl;

import java.util.List;

import dao.SearchStockDao;
import entity.Stock;
import service.SearchStockService;

public class SearchStockServiceImpl implements SearchStockService {

	private SearchStockDao searchStockDao = null;
	
	public SearchStockDao getSearchStockDao() {
		return searchStockDao;
	}

	public void setSearchStockDao(SearchStockDao searchStockDao) {
		this.searchStockDao = searchStockDao;
	}

	@Override
	public List<Stock> getAllStock() {
		return searchStockDao.getAllStock();
	}

}
