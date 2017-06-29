package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.SearchProductDao;
import entity.Product;

public class SearchProductDaoImpl implements SearchProductDao {

	@Override
	public List<Product> getAllProduct() {
		Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        String hql = "from Product";
    	Query query = session.createQuery(hql);
    	
    	@SuppressWarnings("unchecked")
		List<Product> list = query.list();
		return list;
	}
	
}
