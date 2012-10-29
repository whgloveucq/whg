package whg.action.base;



import com.opensymphony.xwork2.ActionSupport;
import whg.service.Manager;

public class BaseAction extends ActionSupport {
	protected Manager mgr;
	public void setMgr(Manager mgr)
	{
		this.mgr = mgr;
	}
}
