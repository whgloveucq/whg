package whg.service;
import whg.exception.*;


public interface Manager {

	String validLogin(String userId , String passWord)
	throws WholeException;
	
}
