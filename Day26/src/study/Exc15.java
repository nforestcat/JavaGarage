package study;

public class Exc15 {
	
	static void method1(boolean b) {
		try {
			System.out.println(1);
			if(b)
				throw new ArithmeticException();
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(false);
		method1(true);
	}

}
//1256
//135