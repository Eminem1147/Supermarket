package action;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Employee;
import service.DeleteEmployeeService;
import service.InsertEmployeeService;
import service.SearchEmployeeService;

public class EmployeeAction extends ActionSupport {

	private static final long serialVersionUID = -2493301504889727331L;

	private String name;
	private String email;
	private String telephone;
	private Date employdate;
	
	private int delete_id;
	
	private SearchEmployeeService searchEmployeeService = null;
	private InsertEmployeeService insertEmployeeService = null;
	private DeleteEmployeeService deleteEmployeeService = null;

	public String search() {
		List<Employee> myEmployeeList = searchEmployeeService.getAllEmployee();
        
        if(myEmployeeList.size() == 0) {
        	return "error";
        }
        
        // 获取Context上下文对象
        ActionContext ac = ActionContext.getContext();
        // 将myAccountList集合添加到上下文对象里
        ac.put("myEmployeeList", myEmployeeList);
        
        // 返回一个字符串
        return "search";
	}
	
	public String insert() {
		Employee employee = new Employee(name, email, telephone, employdate);
		if(insertEmployeeService.insertEmployee(employee) == 1) return "insert";
		else return "error";
	}
	
	@SuppressWarnings("deprecation")
	public void validateInsert() {
		if(this.name.trim().equals("")) {
			this.addFieldError("name", "姓名不能为空");
		} else if(email != null && !Pattern.compile("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$").matcher(this.email).matches()) {
			this.addFieldError("email", "电子邮箱格式不正确");
		} else if(telephone != null && !Pattern.compile("^1[358]\\d{9}$").matcher(this.telephone).matches()) {
			this.addFieldError("telephone", "手机号码格式不正确");
		} else if(employdate != null && !Pattern.compile("^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$").matcher(new String((employdate.getYear() + 1900) + "-" + (employdate.getMonth() + 1) + "-" + employdate.getDate())).matches()) {
			this.addFieldError("employdate", "日期格式不正确");
		}
	}
	
	public String delete() {
		if(deleteEmployeeService.deleteEmployee(delete_id) == 1) return "delete";
		else return "error";
	}
	
	public SearchEmployeeService getSearchEmployeeService() {
		return searchEmployeeService;
	}

	public void setSearchEmployeeService(SearchEmployeeService searchEmployeeService) {
		this.searchEmployeeService = searchEmployeeService;
	}

	public InsertEmployeeService getInsertEmployeeService() {
		return insertEmployeeService;
	}

	public void setInsertEmployeeService(InsertEmployeeService insertEmployeeService) {
		this.insertEmployeeService = insertEmployeeService;
	}

	public DeleteEmployeeService getDeleteEmployeeService() {
		return deleteEmployeeService;
	}

	public void setDeleteEmployeeService(DeleteEmployeeService deleteEmployeeService) {
		this.deleteEmployeeService = deleteEmployeeService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Date getEmploydate() {
		return employdate;
	}

	public void setEmploydate(Date employdate) {
		this.employdate = employdate;
	}

	public int getDelete_id() {
		return delete_id;
	}

	public void setDelete_id(int delete_id) {
		this.delete_id = delete_id;
	}
	
}
