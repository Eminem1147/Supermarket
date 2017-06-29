package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.SearchStockDao;
import entity.Stock;

public class SearchStockDaoImpl implements SearchStockDao {

	@Override
	public List<Stock> getAllStock() {
		Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        String hql = "from Stock";
    	Query query = session.createQuery(hql);
    	
    	@SuppressWarnings("unchecked")
		List<Stock> list = query.list();
		return list;
	}

}
