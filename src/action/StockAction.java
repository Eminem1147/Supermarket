package action;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Stock;
import service.InsertStockService;
import service.SearchStockService;

public class StockAction extends ActionSupport {

	private static final long serialVersionUID = -5269877524047123975L;

	private int productid;
	private String productname;
	private int number;
	private Date producedate;
	
	private SearchStockService searchStockService = null;
	private InsertStockService insertStockService = null;

	public String search() {
		List<Stock> myStockList = searchStockService.getAllStock();
        
        if(myStockList.size() == 0) {
        	return "error";
        }
        
        // ��ȡContext�����Ķ���
        ActionContext ac = ActionContext.getContext();
        // ��myAccountList������ӵ������Ķ�����
        ac.put("myStockList", myStockList);
        
        // ����һ���ַ���
        return "search";
	}
	
	public String insert() {
		Stock stock = new Stock(productid, productname, number, producedate);
		if(insertStockService.insertStock(stock) == 1) return "insert";
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

	public SearchStockService getSearchStockService() {
		return searchStockService;
	}

	public void setSearchStockService(SearchStockService searchStockService) {
		this.searchStockService = searchStockService;
	}

	public InsertStockService getInsertStockService() {
		return insertStockService;
	}

	public void setInsertStockService(InsertStockService insertStockService) {
		this.insertStockService = insertStockService;
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
