package study;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent gp = new Child();
		gp.name = "grand papa";
		gp.age = 90;
		gp.print();
		gp.test();
		System.out.println("------------------------");
		
		Child c = new Child();
		c.name = "child momo";
		c.age = 10;
		c.hobby = "study";
		c.print();
		c.test();
		c.parentPrint();
		
		Parent p = new Child();
		p.name = "parents";
		p.age = 50;
		p.print();
	}

}
abstract class GrandParent{
	protected String name = "";
	protected int age = 0;
	GrandParent(){
		System.out.println("GrandParent 생성자");
	}
	public abstract void print();
	public abstract void test();
}

abstract class Parent extends GrandParent{
	Parent(){
		System.out.println("Parent 생성자");
	}
	public void print() {
		System.out.println("parent");
		System.out.println("name = " + name);
	}
}

class Child extends Parent{
	public String hobby = "";
	Child(){
		System.out.println("Child 생성자");
	}
	public void print() {
		System.out.println("child");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
	public void test() {
		System.out.println("hobby = "+ hobby);
	}
	
	public void parentPrint() {
		super.print();
	}
}