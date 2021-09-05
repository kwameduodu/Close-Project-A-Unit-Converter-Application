package daos;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
	
	T get(int id) throws SQLException;
	
	List<T> getAll() throws SQLException;
	
	void save(T t) throws SQLException;
	
	void update(T t, String[] params);
	
	void delect(T t);
	

}
