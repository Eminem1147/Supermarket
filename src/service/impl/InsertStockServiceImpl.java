package service.impl;

import dao.InsertStockDao;
import entity.Stock;
import service.InsertStockService;

public class InsertStockServiceImpl implements InsertStockService {

	private InsertStockDao insertStockDao = null;
	
	public InsertStockDao getInsertStockDao() {
		return insertStockDao;
	}

	public void setInsertStockDao(InsertStockDao insertStockDao) {
		this.insertStockDao = insertStockDao;
	}

	@Override
	public int insertStock(Stock stock) {
		return insertStockDao.insertStock(stock);
	}

}
