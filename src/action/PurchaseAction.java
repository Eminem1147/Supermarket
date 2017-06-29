package action;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Purchase;
import service.InsertPurchaseService;
import service.SearchPurchaseService;

public class PurchaseAction extends ActionSupport {

	private static final long serialVersionUID = 2484245575239919353L;

	private int productid;
	private String productname;
	private int number;
	private Date producedate;
	
	private SearchPurchaseService searchPurchaseService = null;
	private InsertPurchaseService insertPurchaseService = null;

	public String search() {
		List<Purchase> myPurchaseList = searchPurchaseService.getAllPurchase();
        
        if(myPurchaseList.size() == 0) {
        	return "error";
        }
        
        // ��ȡContext�����Ķ���
        ActionContext ac = ActionContext.getContext();
        // ��myAccountList������ӵ������Ķ�����
        ac.put("myPurchaseList", myPurchaseList);
        
        // ����һ���ַ���
        return "search";
	}
	
	public String insert() {
		Purchase purchase = new Purchase(productid, productname, number, producedate);
		if(insertPurchaseService.insertPurchase(purchase) == 1) return "insert";
		else return "error";
	}
	
	@SuppressWarnings("deprecation")
	public void validateInsert() {
		if(this.productid == 0) {
			this.addFieldError("productid", "��ƷID����Ϊ��");
		} else if(productname.trim().equals("")) {
			this.addFieldError("productname", "��Ʒ������Ϊ��");
		} else if(number == 0) {
			this.addFieldError("number", "��������Ϊ��");
		} else if(producedate != null && !Pattern.compile("^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$").matcher(new String((producedate.getYear() + 1900) + "-" + (producedate.getMonth() + 1) + "-" + producedate.getDate())).matches()) {
			this.addFieldError("producedate", "���ڸ�ʽ����ȷ");
		}
	}
	
	public SearchPurchaseService getSearchPurchaseService() {
		return searchPurchaseService;
	}

	public void setSearchPurchaseService(SearchPurchaseService searchPurchaseService) {
		this.searchPurchaseService = searchPurchaseService;
	}

	public InsertPurchaseService getInsertPurchaseService() {
		return insertPurchaseService;
	}

	public void setInsertPurchaseService(InsertPurchaseService insertPurchaseService) {
		this.insertPurchaseService = insertPurchaseService;
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
