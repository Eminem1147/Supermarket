package action;

import com.opensymphony.xwork2.ActionSupport;

/*
 * 负责跳转页面的action
 */
public class ChangeURLAction extends ActionSupport {

	
	private static final long serialVersionUID = -717001601755791201L;

	public String execute() {
		return "success";
	}
	
}
