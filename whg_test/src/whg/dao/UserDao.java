package whg.dao;

import java.util.List;
import whg.model.*;


/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see whg.model.User
 * @author MyEclipse Persistence Tools
 */

/**
 * @author whg
 *
 */


public interface UserDao  {
	/**
	 * @author whg
	 * * ����id�����û�
	 * @param id ��Ҫ���ҵ��û�id
	 */
	User get(String userId);
	
	
	/**
	 * @author whg
	 *�����û�
	 */
	void save(User user) ;
	
	/**
	 * @author whg
	 *�޸��û�
	 */
	void update(User user) ;
	/**
	 * @author whg
	 *ɾ���û�
	 */
	void delete(User user) ;
	/**
	 * @author whg
	 *��ѯȫ���û�
	 */
	List<User> findAll();
	/**
	 * @author whg
	 *
	 */
	User findUserByNameAndPass(String userName , String passWord);
	/**
	 * @author whg
	 *
	 */
   User findUserByIdAndPass(String userId , String passWord);
	/**
	 * @author whg
	 *
	 */
	
	
	
}