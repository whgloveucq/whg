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
	 * * 根据id查找用户
	 * @param id 需要查找的用户id
	 */
	User get(String userId);
	
	
	/**
	 * @author whg
	 *增加用户
	 */
	void save(User user) ;
	
	/**
	 * @author whg
	 *修改用户
	 */
	void update(User user) ;
	/**
	 * @author whg
	 *删除用户
	 */
	void delete(User user) ;
	/**
	 * @author whg
	 *查询全部用户
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