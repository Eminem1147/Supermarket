package action;

import java.util.List;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Account;
import service.DeleteAccountService;
import service.InsertAccountService;
import service.SearchAccountService;

public class AccountAction extends ActionSupport {

	private static final long serialVersionUID = -4724880639991563099L;

	private String name;
	private String password;
	private String realname;
	private String email;
	private String telephone;
	
	private int delete_id;

	private SearchAccountService searchAccountService = null;
	private InsertAccountService insertAccountService = null;
	private DeleteAccountService deleteAccountService = null;

	public String search() {
		// 获取SearchAccountService实例，调用getAllAccount()方法
        // 将结果保存到List集合里
        List<Account> myAccountList = searchAccountService.getAllAccount();
        
        if(myAccountList.size() == 0) {
        	return "error";
        }
        
        // 获取Context上下文对象
        ActionContext ac = ActionContext.getContext();
        // 将myAccountList集合添加到上下文对象里
        ac.put("myAccountList", myAccountList);
        
        // 返回一个字符串
        return "search";
	}
	
	public String insert() {
		Account account = new Account(name, password, realname, email, telephone);
		if(insertAccountService.insertAccount(account) == 1) return "insert";
		else return "error";
	}
	
	public void validateInsert() {
		if(this.name.trim().equals("")) {
			this.addFieldError("name", "姓名不能为空");
		} else if(this.password.trim().equals("")) {
			this.addFieldError("password", "密码不能为空");
		} else if(this.realname.trim().equals("")) {
			this.addFieldError("realname", "真实姓名不能为空");
		} else if(email != null && !Pattern.compile("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$").matcher(this.email).matches()) {
			this.addFieldError("email", "电子邮箱格式不正确");
		} else if(telephone != null && !Pattern.compile("^1[358]\\d{9}$").matcher(this.telephone).matches()) {
			this.addFieldError("telephone", "手机号码格式不正确");
		}
	}
	
	public String delete() {
		if(deleteAccountService.deleteAccount(delete_id) == 1) return "delete";
		else return "error";
	}
	
	public InsertAccountService getInsertAccountService() {
		return insertAccountService;
	}

	public void setInsertAccountService(InsertAccountService insertAccountService) {
		this.insertAccountService = insertAccountService;
	}

	public String getName() {
		return name;
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

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getDelete_id() {
		return delete_id;
	}

	public void setDelete_id(int delete_id) {
		this.delete_id = delete_id;
	}
	
	public SearchAccountService getSearchAccountService() {
		return searchAccountService;
	}

	public void setSearchAccountService(SearchAccountService searchAccountService) {
		this.searchAccountService = searchAccountService;
	}

	public DeleteAccountService getDeleteAccountService() {
		return deleteAccountService;
	}

	public void setDeleteAccountService(DeleteAccountService deleteAccountService) {
		this.deleteAccountService = deleteAccountService;
	}
	
}
