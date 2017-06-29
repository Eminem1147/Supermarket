package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.SearchSellDao;
import entity.Sell;

public class SearchSellDaoImpl implements SearchSellDao {

	@Override
	public List<Sell> getAllSell() {
		Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        String hql = "from Sell";
    	Query query = session.createQuery(hql);
    	
    	@SuppressWarnings("unchecked")
		List<Sell> list = query.list();
		return list;
	}

}
