/**
 * 
 */
package whg.dao;
import java.util.List;
import whg.model.*;

/**
 * @author whg
 *
 */
public interface BulletinDao {
	
	Bulletin get(Integer id );
	
	void save(Bulletin bulletin) ;
	void update(Bulletin bulletin) ;
	void delete(Integer id) ;
	void delete(Bulletin bulletin) ;
	List<Bulletin> findAll();
	
	

}
