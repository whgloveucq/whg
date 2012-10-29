package whg.service.impl;

import org.apache.log4j.Logger;
import whg.exception.*;
import whg.model.*;
import whg.dao.UserDao;
import whg.service.*;


public class ManagerImpl implements Manager {
	private UserDao userdao;
    private UserDao mgr;
	public UserDao getMgr() {
		return mgr;
	}



	public void setMgr(UserDao mgr) {
		this.mgr = mgr;
	}



	static Logger log = Logger.getLogger(ManagerImpl.class.getName());
	
	public UserDao getUserdao() {
		return userdao;
	}



	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}



	public String validLogin(String userId , String passWord) throws WholeException
	{
		try
		{
		User u = userdao.findUserByIdAndPass(userId , passWord);

			System.out.println(u);
			if (u != null)
			{
				return u.getUserId();
				
			}
			return "error";
		}
		catch (Exception e)
		{   User u = userdao.findUserByIdAndPass(userId , passWord);
			System.out.println("warnings"+ u.getUserId()) ;
			log.debug(e.getMessage());
			throw new WholeException("处理用户登录出现异常,请重试");
		}
	}
/*	public static void main(String[] args)
	{  
		//return validLogin(userid,password);
		ManagerImpl tt = null;
		String userId="342224197902151232";
		String passWord="111111" ;
		try {
			System.out.println(tt.validLogin(userId, passWord));
		} catch (WholeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/
}
