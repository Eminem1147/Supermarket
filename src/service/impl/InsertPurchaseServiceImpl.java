package service.impl;

import dao.InsertPurchaseDao;
import entity.Purchase;
import service.InsertPurchaseService;

public class InsertPurchaseServiceImpl implements InsertPurchaseService {

	private InsertPurchaseDao insertPurchaseDao = null;
	
	public InsertPurchaseDao getInsertPurchaseDao() {
		return insertPurchaseDao;
	}

	public void setInsertPurchaseDao(InsertPurchaseDao insertPurchaseDao) {
		this.insertPurchaseDao = insertPurchaseDao;
	}

	@Override
	public int insertPurchase(Purchase purchase) {
		return insertPurchaseDao.insertPurchase(purchase);
	}

}
