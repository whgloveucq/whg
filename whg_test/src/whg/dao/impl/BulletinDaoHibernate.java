/**
 * 
 */
package whg.dao.impl;
import java.util.List;

import whg.model.*;
import whg.dao.*;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author whg
 *
 */
public class BulletinDaoHibernate extends HibernateDaoSupport 
implements BulletinDao
{

	public Bulletin get(Integer id) {
		// TODO Auto-generated method stub
		return (Bulletin)getHibernateTemplate().get(Bulletin.class, id);
	
	}

	public void save(Bulletin bulletin) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(bulletin);
	}

	public void update(Bulletin bulletin) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(bulletin);
	}

	public void delete(Bulletin bulletin) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(bulletin);
	}

	public List<Bulletin> findAll() {
		// TODO Auto-generated method stub
		return (List<Bulletin>)getHibernateTemplate().find("from Bulletin");
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(id)) ;
	}

}
