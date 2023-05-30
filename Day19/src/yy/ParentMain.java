package yy;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent gp = new GrandParent();
		gp.name = "조부모";
		gp.age = 80;
		gp.printGrandParentInfo();
		System.out.println("-------------------");
		
		Parent p = new Parent();
		p.name = "부모";
		p.age = 50;
		p.job = "회사원";
		p.printParentInfo();
		System.out.println("-------------------");
		
		Child2 c = new Child2();
		c.name = "자식";
		c.age = 20;
		c.job = "학생";
		c.hobby = "드럼";
		System.out.println("-------------------");
		
		c.printGrandParentInfo();
		c.printParentInfo();
		c.printChild2Info();
	}

}
class GrandParent{
	protected String name;
	protected int age;
	public GrandParent() {
		System.out.println("GrandParent의 생성자");
		
	}
	public void printGrandParentInfo() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
}

class Parent extends GrandParent{
	public String job;
	public Parent() {
		System.out.println("Parent의 생성자");
	}
	public void printParentInfo() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("job : "+job);
	}
}

class Child2 extends Parent{
	public String hobby;
	
	public Child2() {
		System.out.println("Child의 생성자");
		
	}
	
	public void printChild2Info() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("job : "+job);
		System.out.println("hobby : "+hobby);
	}
}