package study;

public class CoParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoParent cp = new CoParent();
		Parent p = cp.getObj();
		p.printInfo();
		System.out.println("--------------");
		
		CoChild cc = new CoChild();
		Child c = cc.getObj();
		c.printInfo();
	}

}
class CoParent{
	protected Parent p = new Parent();
	public CoParent() {
		p.name = "parent";
	}
	public Parent getObj() {
		return p;
	}
}
class CoChild extends CoParent{
	Child c = new Child();
	public CoChild() {
		c.name = "child";
		c.setHobby("swimming");
	}
	public Child getObj() {
		return c;
	}
}