package action;

import com.opensymphony.xwork2.ActionSupport;

import service.LoginService;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 7922979648150320921L;
	
	// 这里是和jsp的每个标签的name属性的值对应的
	private String name;
	private String password;
	
	// 调用service接口，注意这里是接口！！！
	private LoginService loginService;
	
	// 一定不要忘了set和get方法
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
			this.addFieldError("name", "用户名不能为空");
		} else if(this.password.trim().equals("")) {
			this.addFieldError("password", "密码不能为空");
		}
	}
	
}
