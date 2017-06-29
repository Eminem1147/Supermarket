package entity;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private String email;
	private String telephone;
	private Date employdate;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String email, String telephone, Date employdate) {
		super();
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.employdate = employdate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
