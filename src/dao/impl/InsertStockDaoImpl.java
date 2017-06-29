package dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.InsertStockDao;
import entity.Stock;

public class InsertStockDaoImpl implements InsertStockDao {

	@SuppressWarnings("deprecation")
	@Override
	public int insertStock(Stock stock) {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        // ±£´æ(insert)
        Stock stock1 = new Stock();
        stock1.setProductid(stock.getProductid());
        stock1.setProductname(stock.getProductname());
        stock1.setNumber(stock.getNumber());
        stock1.setProducedate(stock.getProducedate());
        
        try {
        	session.save(stock1);
        	return 1;
        } catch(Exception e) {
        	return 0;
        } finally {
        	tr.commit();  
            session.close();
        }
	}

}
