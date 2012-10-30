package whg.action;
import java.util.*;

import whg.action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;
import whg.dao.BulletinDao;
import whg.model.Bulletin;

public class AddBulletin extends BaseAction {
	private String title;
	private String content;
	private String appendix;
	private String authid;
	private BulletinDao bulletindao ;
	private Bulletin bulletin ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAppendix() {
		return appendix;
	}
	public void setAppendix(String appendix) {
		this.appendix = appendix;
	}
	public String getAuthid() {
		return authid;
	}
	public void setAuthid(String authid) {
		this.authid = authid;
	}
	public BulletinDao getBulletindao() {
		return bulletindao;
	}
	
	
	public Bulletin getBulletin() {
		return bulletin;
	}
	public void setBulletin(Bulletin bulletin) {
		this.bulletin = bulletin;
	}
	public void setBulletindao(BulletinDao bulletindao) {
		this.bulletindao = bulletindao;
	}
	
	public String execute() throws Exception
	{
	
		bulletindao.save(bulletin);
		
		return SUCCESS;
	}
	
	
	

}
