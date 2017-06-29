package dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.InsertAccountDao;
import entity.Account;

public class InsertAccountDaoImpl implements InsertAccountDao {

	@SuppressWarnings("deprecation")
	@Override
	public int insertAccount(Account account) {
		
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        // ±£´æ(insert)
        Account account1 = new Account();
        account1.setName(account.getName());
        account1.setPassword(account.getPassword());
        account1.setRealname(account.getRealname());
        account1.setEmail(account.getEmail());
        account1.setTelephone(account.getTelephone());
        
        try {
        	session.save(account1);
        	return 1;
        } catch(Exception e) {
        	return 0;
        } finally {
        	tr.commit();  
            session.close();
        }
        
	}	

}
