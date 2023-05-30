package function;

import java.util.Scanner;

public class Function03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result = sum(1, 2);
		System.out.println(result);
		
		result = minus(2, 1);
		System.out.println(result);
		
		result = multiply(3, 4);
		System.out.println(result);
		
		float result2 = divide(4, 3);
		System.out.println(result2);
		
		
		sc.close();
	}
	
	public static int sum(int a, int b) {
		int c = 0;
		c = a + b;
		return c;
	}
	
	public static int minus(int a , int b) {
		return a - b;
	}
	
	public static int multiply(int a , int b) {
		return a * b;
	}
	
	public static float divide(float a , int b) {
		return (float)(a / b);
	}
	
}
