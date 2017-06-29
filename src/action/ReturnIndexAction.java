package action;

import com.opensymphony.xwork2.ActionSupport;

public class ReturnIndexAction extends ActionSupport {

	private static final long serialVersionUID = 6990851516463208066L;
	
	public String execute() {
		return "success";
	}

}
