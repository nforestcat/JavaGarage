package test;

public class Interfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		A d2 = new D();
		E e = new E();
		e.method();
		e.method1();
		e.method2();
		C e1 = new E();
		e1.method();
		B e2 = new E();
		e2.method();
		e2.method1();
		e2.method2();
		A e3 = new E();
	}

}
interface A{
	void method1();
}
interface B extends A, C{
	void method2();
}
interface C{
	void method();
}
class D implements A{
	public void method1() {
		System.out.println("method1()");
	}
	
}
class E implements B{
	public void method1() {
		System.out.println("method1()");
	}
	public void method2() {
		System.out.println("method2()");
	}
	public void method() {
		System.out.println("method()");
	}
}