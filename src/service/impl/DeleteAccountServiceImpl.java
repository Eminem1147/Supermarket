package service.impl;

import dao.DeleteAccountDao;
import service.DeleteAccountService;

public class DeleteAccountServiceImpl implements DeleteAccountService {

	private DeleteAccountDao deleteAccountDao = null;
	
	public DeleteAccountDao getDeleteAccountDao() {
		return deleteAccountDao;
	}

	public void setDeleteAccountDao(DeleteAccountDao deleteAccountDao) {
		this.deleteAccountDao = deleteAccountDao;
	}

	@Override
	public int deleteAccount(int delete_id) {
		return deleteAccountDao.deleteAccount(delete_id);
	}

}
