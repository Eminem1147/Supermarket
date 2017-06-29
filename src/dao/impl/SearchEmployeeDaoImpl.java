package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.SearchEmployeeDao;
import entity.Employee;

public class SearchEmployeeDaoImpl implements SearchEmployeeDao {

	@Override
	public List<Employee> getAllEmployee() {
		Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        String hql = "from Employee";
    	Query query = session.createQuery(hql);
    	
    	@SuppressWarnings("unchecked")
		List<Employee> list = query.list();
		return list;
	}

}
