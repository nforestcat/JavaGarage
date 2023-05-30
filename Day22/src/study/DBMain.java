package study;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Process{
	
}
interface DBInterface{
	void connect();
	void select();
	void insert();
	void update();
	void delete();
}
class OracleImpl implements DBInterface{
	
}
class MSImpl implements DBInterface{
	
}