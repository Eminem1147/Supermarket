package service.impl;

import dao.LoginDao;
import service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao;
	
	// 别忘了set和get，否则无法注入
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public boolean accountExist(String name, String password) {
		if(loginDao.accountExist(name, password)) {
			return true;
		} else {
			return false;
		}
	}

}
