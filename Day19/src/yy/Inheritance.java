package yy;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		Child c = new Child();
		System.out.println(c.hobby);
		//내가 가지고 있지 않은 멤버임에도
		//Person을 상속받았기 때문에 쓸 수 있다.
		System.out.println(c.no);
		System.out.println(c.name);
	}

}
class Child extends Person
{
	int hobby;
	Child(){
		System.out.println("default 생성자");
	}
}
class Person
{
	int no;
	String name;
	Person(){
		System.out.println("Person의 생성자");
	}
}