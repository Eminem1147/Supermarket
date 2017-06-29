package action;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Sell;
import service.InsertSellService;
import service.SearchSellService;

public class SellAction extends ActionSupport {

	private static final long serialVersionUID = -5370740281315954047L;

	private int productid;
	private String productname;
	private int number;
	private Date selldate;
	
	private SearchSellService searchSellService = null;
	private InsertSellService insertSellService = null;

	public String search() {
		List<Sell> mySellList = searchSellService.getAllSell();
        
        if(mySellList.size() == 0) {
        	return "error";
        }
        
        // ��ȡContext�����Ķ���
        ActionContext ac = ActionContext.getContext();
        // ��myAccountList������ӵ������Ķ�����
        ac.put("mySellList", mySellList);
        
        // ����һ���ַ���
        return "search";
	}
	
	public String insert() {
		Sell sell = new Sell(productid, productname, number, selldate);
		if(insertSellService.insertSell(sell) == 1) return "insert";
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
		} else if(selldate != null && !Pattern.compile("^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$").matcher(new String((selldate.getYear() + 1900) + "-" + (selldate.getMonth() + 1) + "-" + selldate.getDate())).matches()) {
			this.addFieldError("selldate", "���ڸ�ʽ����ȷ");
		}
	}

	public SearchSellService getSearchSellService() {
		return searchSellService;
	}

	public void setSearchSellService(SearchSellService searchSellService) {
		this.searchSellService = searchSellService;
	}

	public InsertSellService getInsertSellService() {
		return insertSellService;
	}

	public void setInsertSellService(InsertSellService insertSellService) {
		this.insertSellService = insertSellService;
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
