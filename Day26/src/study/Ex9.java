package study;

public class Ex9 {

	static void method2() {
		throw new NullPointerException();
	}
	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(5);
		}
		System.out.println(6);
	}

}
//3
//5
//6
//nullpointerexception을 던졌는데 
//받는건 arithmeticexception이므로 받을 수 없고 
//try - catch구문은 스킵
//finally 구문의 3만 출력
//그리고 main에서 try - catch에서 exception e로 받으므로
//5 출력
//그리고 6 출력
