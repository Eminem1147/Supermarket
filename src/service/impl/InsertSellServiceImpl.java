package service.impl;

import dao.InsertSellDao;
import entity.Sell;
import service.InsertSellService;

public class InsertSellServiceImpl implements InsertSellService {

	private InsertSellDao insertSellDao = null;
	
	public InsertSellDao getInsertSellDao() {
		return insertSellDao;
	}

	public void setInsertSellDao(InsertSellDao insertSellDao) {
		this.insertSellDao = insertSellDao;
	}

	@Override
	public int insertSell(Sell sell) {
		return insertSellDao.insertSell(sell);
	}

}
