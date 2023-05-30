package study;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar v1 = new StaticVar();
		v1.staticTest();
		StaticVar v2 = new StaticVar();
		v2.staticTest();
		
		StaticVar v3 = new StaticVar();
		v3.staticTest();
		
		v1.a = 50;
		v1.b = 500;
		
		System.out.println(v1.a);
		System.out.println(v1.b);
		
		System.out.println(v2.a);
		System.out.println(v2.b);
		
		System.out.println(v3.a);
		System.out.println(v3.b);
		
	}

}
class StaticVar{
	static int a = 1;
	int b = 1;
	void staticTest() {
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------------------");
	}
}