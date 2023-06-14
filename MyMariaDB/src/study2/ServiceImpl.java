package study2;

import java.util.ArrayList;

class ServiceImpl implements Service{
	DaoImpl dao = new DaoImpl();
	public void close() {
		dao.close();
	}
	public boolean insert(Product p) {
		return dao.insert(p);
	}
	public boolean delete(int num) {
		return dao.delete(num);
	}
	public boolean update(Product p) {
		return dao.update(p);
	}
	public ArrayList<Product> selectAll(){
		return dao.selectAll();
	}
	public Product select(int num) {
		return dao.select(num);
	}
}
