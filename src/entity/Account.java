package entity;

/*
 * �����ݿ��һ�£���Ϊһ��java����
 * 1���������������ݿ���е�һ�м�¼
 * 1�����Դ�����Ǳ��е�һ���ֶ�
 */
public class Account {

	private int id;
	private String name;
	private String password;
	private String realname;
	private String email;
	private String telephone;
	
	public Account() {
		super();
	}
	
	public Account(String name, String password, String realname, String email, String telephone) {
		super();
		this.name = name;
		this.password = password;
		this.realname = realname;
		this.email = email;
		this.telephone = telephone;
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
	
}
