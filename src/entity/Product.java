package entity;

public class Product {

	private int id;
	private String name;
	private float inprice;
	private float saleprice;
	private int qualityguarantee;
	
	public Product() {
		super();
	}
	
	public Product(String name, float inprice, float saleprice, int qualityguarantee) {
		super();
		this.name = name;
		this.inprice = inprice;
		this.saleprice = saleprice;
		this.qualityguarantee = qualityguarantee;
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
	public float getInprice() {
		return inprice;
	}
	public void setInprice(float inprice) {
		this.inprice = inprice;
	}
	public float getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(float saleprice) {
		this.saleprice = saleprice;
	}
	public int getQualityguarantee() {
		return qualityguarantee;
	}
	public void setQualityguarantee(int qualityguarantee) {
		this.qualityguarantee = qualityguarantee;
	}
	
}
