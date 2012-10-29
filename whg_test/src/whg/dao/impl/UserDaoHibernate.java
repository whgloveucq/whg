package whg.dao.impl;
import java.util.*;
import whg.dao.*;
import whg.model.*;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoHibernate 
extends HibernateDaoSupport implements UserDao
{

	public User get(String userId) {
		// TODO Auto-generated method stub
		return (User)getHibernateTemplate().get(User.class, userId);
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(user);
	}

	public void delete(String userId) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(userId));
	}
	
	public void delete(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return ( List<User> )getHibernateTemplate().find("from User");
	}

	public User findUserByNameAndPass(String userName, String passWord) {
		// 	//执行HQL查询
		List<User> ul=(List<User>)getHibernateTemplate().find("from User u where u.userName=? and u.passWord=? ", new String[] {userName,passWord});
		if (ul.size()==1)
		{
			return (User)ul.get(0);
			
			
		}
		return null;
	}
	public User findUserByIdAndPass(String userId, String passWord) {
		// 	//执行HQL查询
		List<User> ul=(List<User>)getHibernateTemplate().find("from User u where u.userId= ? and u.passWord= ? ", new String[] {userId,passWord});
		if (ul.size()==1)
		{
			return (User)ul.get(0);
			
			
		}
		return null;
	}
	

}
