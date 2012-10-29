package whg.action.base;


import com.opensymphony.xwork2.Action;
import whg.service.Manager;
public class BaseActionInterface implements Action {
	protected Manager mgr;
	public void setMgr(Manager mgr)
	{
		this.mgr = mgr;
	}

	public String execute() throws Exception
	{
		return SUCCESS;
	}

}
