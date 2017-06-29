package service.impl;

import java.util.List;

import dao.SearchProductDao;
import entity.Product;
import service.SearchProductService;

public class SearchProductServiceImpl implements SearchProductService {

	private SearchProductDao searchProductDao = null;
	
	public SearchProductDao getSearchProductDao() {
		return searchProductDao;
	}

	public void setSearchProductDao(SearchProductDao searchProductDao) {
		this.searchProductDao = searchProductDao;
	}

	@Override
	public List<Product> getAllProduct() {
		return searchProductDao.getAllProduct();
	}

}
