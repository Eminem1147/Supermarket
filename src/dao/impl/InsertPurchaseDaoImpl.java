package dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.InsertPurchaseDao;
import entity.Purchase;

public class InsertPurchaseDaoImpl implements InsertPurchaseDao {

	@SuppressWarnings("deprecation")
	@Override
	public int insertPurchase(Purchase purchase) {
		SessionFactory sessionFactory;  
        Configuration configuration = new Configuration().configure();  
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();  
        Transaction tr = session.beginTransaction();  
        // ±£´æ(insert)
        Purchase purchase1 = new Purchase();
        purchase1.setProductid(purchase.getProductid());
        purchase1.setProductname(purchase.getProductname());
        purchase1.setNumber(purchase.getNumber());
        purchase1.setProducedate(purchase.getProducedate());
         
        try {
        	session.save(purchase1);
        	return 1;
        } catch(Exception e) {
        	return 0;
        } finally {
        	tr.commit();  
            session.close();
        }
	}

}
