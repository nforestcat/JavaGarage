package study;

public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild sc = new SuperChild();
		sc.print();
	}

}

class SuperParent{
	protected int a = 10;
	public void print() {
		System.out.println("SuperParent의 print()");
		System.out.println("a = " + a + "\n");
	}
}

class SuperChild extends SuperParent{
	private int a = 20;
	public void print() {
		System.out.println("SuperChild의 print()");
		System.out.println("a = " + a + "\n");
		SuperCall();
	}
	public void SuperCall() {
		System.out.println("super.a = " + super.a);
		super.print();
	}
}