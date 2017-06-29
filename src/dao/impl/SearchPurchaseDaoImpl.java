package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.SearchPurchaseDao;
import entity.Purchase;

public class SearchPurchaseDaoImpl implements SearchPurchaseDao {

	@Override
	public List<Purchase> getAllPurchase() {
		Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        String hql = "from Purchase";
    	Query query = session.createQuery(hql);
    	
    	@SuppressWarnings("unchecked")
		List<Purchase> list = query.list();
		return list;
	}

}
