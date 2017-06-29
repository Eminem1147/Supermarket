package entity;

import java.util.Date;

public class Sell {

	private int id;
	private int productid;
	private String productname;
	private int number;
	private Date selldate;
	
	public Sell() {
		super();
	}
	
	public Sell(int productid, String productname, int number, Date selldate) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.number = number;
		this.selldate = selldate;
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
	public Date getSelldate() {
		return selldate;
	}
	public void setSelldate(Date selldate) {
		this.selldate = selldate;
	}
	
}
