package variable;

public class Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
		int a;
		a = 5;
		System.out.println(a);
		boolean b;
		b = false;
		System.out.println(b);
		float c;
		c = 3.14f;
		System.out.println(c);
		String d;
		d = "temp";
		System.out.println(d);
		int temp = 0x1F;
		System.out.println(temp);
		System.out.format("%X%n", 10);
		System.out.printf("%d, %x, %o%n", temp, temp, temp);
		System.out.printf("%X%n", 45);
	}

}
