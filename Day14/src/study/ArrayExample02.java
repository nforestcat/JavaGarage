package study;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5장 6번
		Scanner sc = new Scanner(System.in);
		int[] math = new int[5];
		for(int i = 0; i < math.length; i++) {
			math[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i< math.length; i++) {
			sum += math[i];
		}
		float avg = sum / 5f;
		System.out.println(sum);
		System.out.println(avg);
		
		
		sc.close();
	}

}
