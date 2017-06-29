package dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.InsertSellDao;
import entity.Sell;

public class InsertSellDaoImpl implements InsertSellDao {

	@SuppressWarnings("deprecation")
	@Override
	public int insertSell(Sell sell) {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        // ±£´æ(insert)
        Sell sell1 = new Sell();
        sell1.setProductid(sell.getProductid());
        sell1.setProductname(sell.getProductname());
        sell1.setNumber(sell.getNumber());
        sell1.setSelldate(sell.getSelldate());
        
        try {
        	session.save(sell1);
        	return 1;
        } catch(Exception e) {
        	return 0;
        } finally {
        	tr.commit();  
            session.close();
        }
	}

}
