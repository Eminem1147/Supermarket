package entity;

import java.util.Date;

public class Purchase {

	private int id;
	private int productid;
	private String productname;
	private int number;
	private Date producedate;
	
	public Purchase() {
		super();
	}
	
	public Purchase(int productid, String productname, int number, Date producedate) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.number = number;
		this.producedate = producedate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getProducedate() {
		return producedate;
	}
	public void setProducedate(Date producedate) {
		this.producedate = producedate;
	}
	
}
