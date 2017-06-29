package dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.InsertEmployeeDao;
import entity.Employee;

public class InsertEmployeeDaoImpl implements InsertEmployeeDao {

	@SuppressWarnings("deprecation")
	@Override
	public int insertEmployee(Employee employee) {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        // ±£´æ(insert)
        Employee employee1 = new Employee();
        employee1.setName(employee.getName());
        employee1.setEmail(employee.getEmail());
        employee1.setTelephone(employee.getTelephone());
        employee1.setEmploydate(employee.getEmploydate());
        
        try {
        	session.save(employee1);
        	return 1;
        } catch(Exception e) {
        	return 0;
        } finally {
        	tr.commit();  
            session.close();
        }
	}
	
}
