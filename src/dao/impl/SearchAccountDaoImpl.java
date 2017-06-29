package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.SearchAccountDao;
import entity.Account;

public class SearchAccountDaoImpl implements SearchAccountDao {

	@Override
	public List<Account> getAllAccount() {
		Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        String hql = "from Account";
    	Query query = session.createQuery(hql);
    	
    	@SuppressWarnings("unchecked")
		List<Account> list = query.list();
		return list;
	}

}
