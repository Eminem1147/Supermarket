package service.impl;

import java.util.List;

import dao.SearchEmployeeDao;
import entity.Employee;
import service.SearchEmployeeService;

public class SearchEmployeeServiceImpl implements SearchEmployeeService {

	private SearchEmployeeDao searchEmployeeDao = null;
	
	public SearchEmployeeDao getSearchEmployeeDao() {
		return searchEmployeeDao;
	}

	public void setSearchEmployeeDao(SearchEmployeeDao searchEmployeeDao) {
		this.searchEmployeeDao = searchEmployeeDao;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return searchEmployeeDao.getAllEmployee();
	}

}
