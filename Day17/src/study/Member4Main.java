package study;

public class Member4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest t = new ThisTest();
		Member4 m1 = new Member4("aaa", "111", "서울");
		t.setMember4(m1.getMember4());
		Member4 m2 = new Member4("bbb", "222", "경기");
		t.setMember4(m2.getMember4());
		Member4 m3 = new Member4("ccc", "333", "강원");
		t.setMember4(m3);
		t.print();
	}

}
class Member4{
	String name;
	String tel;
	String address;
	Member4(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	Member4 getMember4() {
		return this;
	}
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}
class ThisTest{
	Member4[] arr = new Member4[10];
	int cnt = 0;
	
	void setMember4(Member4 m) {
		arr[cnt++] = m;
	}
	void print() {
		for(int i = 0; i < cnt; i++) {
			arr[i].print();
			System.out.println("-----------------------------");
		}
	}
}