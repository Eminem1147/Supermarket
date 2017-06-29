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

		// sessionFactory这个实例可以自己按常规的hibernate传统写法创建
        // 也可以交给spring去托管
        Configuration cfg = new Configuration().configure();
        @SuppressWarnings("deprecation")
		SessionFactory sessionFactory = cfg.buildSessionFactory();

        // 获取session
        Session session = sessionFactory.openSession();

        // 以HQL语句创建Query对象，执行setString方法为HQL语句的参数赋值
    	// Query调用list方法访问查询的全部实例

    	// HQL语句中的字段是Account.hbm.xml中定义的每个name！！！！！！！！
        // 包括表名！！！！和JavaBean的类名相同！！！！！！！！！！！！！！！！！
        // 那里的表名是大写，这里也要大写（HQL有点特殊）！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
    	String hql = "select id from Account where name=:name and password=:password";
    	Query query = session.createQuery(hql);
    	// 设置参数
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
