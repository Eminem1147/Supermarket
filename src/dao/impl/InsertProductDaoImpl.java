package dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.InsertProductDao;
import entity.Product;

public class InsertProductDaoImpl implements InsertProductDao {

	@SuppressWarnings("deprecation")
	@Override
	public int insertProduct(Product product) {
		SessionFactory sessionFactory;  
        Configuration configuration = new Configuration().configure();  
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();  
        Transaction tr = session.beginTransaction();  
        // ±£´æ(insert)
        Product product1 = new Product();
        product1.setName(product.getName());
        product1.setInprice(product.getInprice());
        product1.setSaleprice(product.getSaleprice());
        product1.setQualityguarantee(product.getQualityguarantee());
         
        try {
        	session.save(product1);
        	return 1;
        } catch(Exception e) {
        	return 0;
        } finally {
        	tr.commit();  
            session.close();
        }
	}

}
