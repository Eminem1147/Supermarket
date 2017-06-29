package action;

import com.opensymphony.xwork2.ActionSupport;

import service.LoginService;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 7922979648150320921L;
	
	// �����Ǻ�jsp��ÿ����ǩ��name���Ե�ֵ��Ӧ��
	private String name;
	private String password;
	
	// ����service�ӿڣ�ע�������ǽӿڣ�����
	private LoginService loginService;
	
	// һ����Ҫ����set��get����
	public String getName() {
		return name;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() {
		if(loginService.accountExist(name, password)) {
			return "success";
		} else {
			return "error";
		}
	}
	
	public void validateExecute() {
		if(this.name.trim().equals("")) {
			this.addFieldError("name", "�û�������Ϊ��");
		} else if(this.password.trim().equals("")) {
			this.addFieldError("password", "���벻��Ϊ��");
		}
	}
	
}
