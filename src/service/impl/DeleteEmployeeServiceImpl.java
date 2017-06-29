package service.impl;

import dao.DeleteEmployeeDao;
import service.DeleteEmployeeService;

public class DeleteEmployeeServiceImpl implements DeleteEmployeeService {

	private DeleteEmployeeDao deleteEmployeeDao = null;
	
	public DeleteEmployeeDao getDeleteEmployeeDao() {
		return deleteEmployeeDao;
	}

	public void setDeleteEmployeeDao(DeleteEmployeeDao deleteEmployeeDao) {
		this.deleteEmployeeDao = deleteEmployeeDao;
	}

	@Override
	public int deleteEmployee(int delete_id) {
		return deleteEmployeeDao.deleteEmployee(delete_id);
	}

}
