package service.impl;

import dao.InsertProductDao;
import entity.Product;
import service.InsertProductService;

public class InsertProductServiceImpl implements InsertProductService {

	private InsertProductDao insertProductDao = null;
	
	public InsertProductDao getInsertProductDao() {
		return insertProductDao;
	}

	public void setInsertProductDao(InsertProductDao insertProductDao) {
		this.insertProductDao = insertProductDao;
	}

	@Override
	public int insertProduct(Product product) {
		return insertProductDao.insertProduct(product);
	}

}
