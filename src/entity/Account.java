package entity;

/*
 * 跟数据库表一致，作为一个java对象
 * 1个对象代表的是数据库表中的一行记录
 * 1个属性代表的是表中的一个字段
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
