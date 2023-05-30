package example;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for ( int i = 0; i<a.length; i++) {
			a[i] = i+1;
		}
		System.out.println("1~10 사이의 정수를 입력해주세요.");
		int key = sc.nextInt();
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			if( key == a[i]) {
				System.out.println("숫자를 찾았습니다");
				System.out.println("숫자는 : "+ a[i]);
				break;
			}
		}
		sc.close();
	}

}
