package service.impl;

import dao.InsertEmployeeDao;
import entity.Employee;
import service.InsertEmployeeService;

public class InsertEmployeeServiceImpl implements InsertEmployeeService {

	private InsertEmployeeDao insertEmployeeDao = null;
	
	public InsertEmployeeDao getInsertEmployeeDao() {
		return insertEmployeeDao;
	}

	public void setInsertEmployeeDao(InsertEmployeeDao insertEmployeeDao) {
		this.insertEmployeeDao = insertEmployeeDao;
	}

	@Override
	public int insertEmployee(Employee employee) {
		return insertEmployeeDao.insertEmployee(employee);
	}

}
