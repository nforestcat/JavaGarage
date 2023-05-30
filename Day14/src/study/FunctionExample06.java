package study;

public class FunctionExample06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 2, k;
		k = sub(i, j);
		System.out.println("k= " + k + "i" + "" + "j");
		
		int result;
		result = pow(3);
		System.out.println("3x3=" + result);
		
		int age = 0;
		age = setAge(8);
		
		int[] star = new int[10];
		drawLine();
		inputStar(star);
		drawLine();
		drawStar(star);
		inputStar(star);
		drawLine();
		drawStar(star);
		
		i = 6;
		j = 9;
		result = mul(i, j);
		System.out.println(result);
		
		float result2 = add (3.14f, 3.14f);
	}
	
	public static int sub(int i , int j) {
		return i - j;
	}
	
	public static int pow(int a) {
		return a*a;
	}
	
	public static int setAge(int a) {
		return a+20;
	}
	
	public static void drawLine() {
		System.out.println("-------------------------");
	}
	
	public static void drawStar(int[] star) {
		for(int i = 0; i < 10; i++) {
			System.out.print(star[i] + "\t");
		}
		System.out.println();
	}
	public static void inputStar(int[] star) {
		for(int i = 0; i < 10; i++) {
			star[i] = i + 1;
		}
	}
	
	public static int mul(int a , int b) {
		return a * b;
	}
	
	public static float add(float a, float b) {
		return a + b;
	}
}
