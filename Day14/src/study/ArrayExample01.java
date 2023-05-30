package study;

import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5장 5번
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int min = 0, max = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				min = a[i];
			} else {
				if(min > a[i]) {
					min = a[i];
				}
			}
		}
		System.out.println(min);
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				max = a[i];
			} else {
				if(max < a[i]) {
					max = a[i];
				}
			}
		}
		System.out.println(max);
		
		/*
		Arrays.sort(a);
		min = a[0];
		max = a[9];
		System.out.println(min); 
		System.out.println(max);
		*/
		
		
	}

}
