package study2;

import java.util.ArrayList;

interface Service {
	boolean insert(Product p);
	boolean delete(int num);
	boolean update(Product p);
	ArrayList<Product> selectAll();
	Product select(int num);
	void close();
}
