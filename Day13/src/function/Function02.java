package function;

public class Function02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		String str = "Hello World!";
		print2(str);
		int kor = 100;
		int eng = 100;
		int math = 100;
		System.out.println(sum(kor, eng, math));
		print3(true);
	}
	public static void print() {
		System.out.println("Hello");
	}
	public static void print2(String str) {
		System.out.println(str);
	}
	public static int sum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	public static void print3(boolean ret) {
		System.out.print("Hello Function");
	}
	
}
