package study;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person();
		hong.input("홍길동", 20, "서울");
		Person.countPerson++;
		Person lee = new Person();
		lee.input("이몽룡", 30, "제천");
		Person.countPerson++;
		Person sung = new Person();
		sung.input("성춘향", 40, "인천");
		Person.countPerson++;
	}

}

class Person{
	static int countPerson;
	String name;
	int age;
	String address;
	
	void input(String _name, int _age, String _address) {
		name = _name;
		age = _age;
		address = _address;
		
	}
	
	static void print() {
		System.out.println(countPerson);
		//System.out.println(name);
		//System.out.println(age);
		//System.out.println(address);
		//printInstance();
	}
	
	void printInstance() {
		System.out.println(name);
	}
}