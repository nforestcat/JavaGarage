package example;

import java.util.Scanner;

public class Arrayexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0; i<a.length; i++) {
			
			a[i] = sc.nextInt();
			
		}
		sc.close();
		
		for(int i = 0; i<a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
	}

}
