package study;

public class Member2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m1 = new Member2();
		m1.print();
		Member2 m2 = new Member2("아이유");
		m2.print();
		Member2 m3 = new Member2("김말숙", "010-9999-8888", "대한민국");
		m3.print();
	}

}
class Member2{
	String name;
	String tel;
	String address;
	Member2(){
		name = "no name";
		tel = "no tel";
		address = "no address";
	}
	Member2(String _name){
		name = _name;
		tel = "no tel";
		address = "no address";
	}
	Member2(String _name, String _tel, String _address){
		name = _name;
		tel = _tel;
		address = _address;
	}
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}