package whg.action;
import java.util.*;

import whg.action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;
import whg.dao.UserDao;


@SuppressWarnings("serial")
public class LoginAction extends  BaseAction {
	
	private String userId;
	private String passWord;
   //private Manager mgr;
	private UserDao userdao;
	public UserDao getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String execute() throws Exception
	{
	    Map session = ActionContext.getContext().getSession();
		String userid = mgr.validLogin(userId, passWord) ;
		System.out.println("userid: " +userid);
		
		if( userid != null && userid != "error" )
		{
			session.put("userid" , userid);
		     return SUCCESS;
			
		}
		else
		{
			addActionError("用户名/密码不匹配");
			
			//ActionContext.getContext().getSession().put("userid2", userId);
			//ActionContext.getContext().getSession().put("passwd", passWord);
			return "failure";
			
		}
		
		
	}
	

}
