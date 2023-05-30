package study;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.name = "parent";
		p.printInfo();
		System.out.println("-----------------");
		Child c = new Child();
		c.name = "child";
		c.setHobby("swimming");
		c.printInfo();
	}

}

class Parent
{
	protected String name;
	
	public void printInfo() {
		System.out.println(name);
	}
}
class Child extends Parent{
	private String hobby;
	public void printInfo() {
		System.out.println(name);
		System.out.println(hobby);
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getHobby() {
		return hobby;
	}
	
	
}