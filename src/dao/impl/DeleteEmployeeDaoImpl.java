package dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.DeleteEmployeeDao;

public class DeleteEmployeeDaoImpl implements DeleteEmployeeDao {

	@SuppressWarnings("deprecation")
	@Override
	public int deleteEmployee(int delete_id) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        
        String hql = "delete from Employee where id = :delete_id";
    	Query query = session.createQuery(hql);
    	
    	query.setParameter("delete_id", delete_id);
    	
    	int result = query.executeUpdate();
    	
    	tr.commit();
        session.close();
        
		return result;
	}

}
