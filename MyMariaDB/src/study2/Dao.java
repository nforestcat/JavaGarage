package study2;

import java.util.ArrayList;

public interface Dao {
	boolean insert(Product p);
	boolean update(Product p);
	boolean delete(int num);
	Product select(int num);
	ArrayList<Product> selectAll();
	void close();
}
