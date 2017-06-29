package action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Product;
import service.InsertProductService;
import service.SearchProductService;

public class ProductAction extends ActionSupport {

	private static final long serialVersionUID = 4851564455689777381L;

	private String name;
	private float inprice;
	private float saleprice;
	private int qualityguarantee;
	
	private SearchProductService searchProductService = null;
	private InsertProductService insertProductService = null;
	
	public String search() {
		List<Product> myProductList = searchProductService.getAllProduct();
        
        if(myProductList.size() == 0) {
        	return "error";
        }
        
        // 获取Context上下文对象
        ActionContext ac = ActionContext.getContext();
        // 将myAccountList集合添加到上下文对象里
        ac.put("myProductList", myProductList);
        
        // 返回一个字符串
        return "search";
	}
	
	public String insert() {
		Product product = new Product(name, inprice, saleprice, qualityguarantee);
		if(insertProductService.insertProduct(product) == 1) return "insert";
		else return "error";
	}
	
	public void validateInsert() {
		if(this.name.trim().equals("")) {
			this.addFieldError("name", "商品名不能为空");
		} else if(this.inprice == 0) {
			this.addFieldError("inprice", "进货价不能为空");
		} else if(this.saleprice == 0) {
			this.addFieldError("saleprice", "销售价不能为空");
		} else if(this.qualityguarantee == 0) {
			this.addFieldError("qualityguarantee", "保质期不能为空");
		}
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

	public SearchProductService getSearchProductService() {
		return searchProductService;
	}

	public void setSearchProductService(SearchProductService searchProductService) {
		this.searchProductService = searchProductService;
	}

	public InsertProductService getInsertProductService() {
		return insertProductService;
	}

	public void setInsertProductService(InsertProductService insertProductService) {
		this.insertProductService = insertProductService;
	}
	
}
