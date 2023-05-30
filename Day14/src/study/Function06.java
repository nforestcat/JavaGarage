package study;

public class Function06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		noRet(add(retInt(), 5));
		
		
		
		
	}
	public static int add(int a,  int b) {
		int c = 0;
			c = a + b;
			return c;
	}
	
	public static void print() {
		System.out.println("before return");
		return;
		//System.out.println("after return");
	}
	
	public static int retInt() {
		int x = 10;
		return x;
	}
	
	public static void noRet(int x) {
		System.out.println("x = " + x);
	}

}
