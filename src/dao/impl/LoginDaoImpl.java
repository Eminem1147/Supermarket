package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.LoginDao;

public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean accountExist(String name, String password) {

		// sessionFactory���ʵ�������Լ��������hibernate��ͳд������
        // Ҳ���Խ���springȥ�й�
        Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();

        // ��ȡsession
        Session session = sessionFactory.openSession();

        // ��HQL��䴴��Query����ִ��setString����ΪHQL���Ĳ�����ֵ
    	// Query����list�������ʲ�ѯ��ȫ��ʵ��

    	// HQL����е��ֶ���Account.hbm.xml�ж����ÿ��name����������������
        // ������������������JavaBean��������ͬ����������������������������������
        // ����ı����Ǵ�д������ҲҪ��д��HQL�е����⣩����������������������������������������������������������
    	String hql = "select id from Account where name=:name and password=:password";
    	Query query = session.createQuery(hql);
    	// ���ò���
    	query.setParameter("name", name);
    	query.setParameter("password", password);
    	@SuppressWarnings("rawtypes")
		List list = query.list();

    	if(list.size() > 0) {
    		return true;
    	} else {
    		return false;
    	}
	}

}
