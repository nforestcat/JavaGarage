package ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("반지름은?");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.println("높이는?");
		Scanner sc3 = new Scanner(System.in);
		int h = sc3.nextInt();
		float pi = 3.14f;
		float v = r * r * pi * h;
		System.out.println("원기둥의 부피는 " + v + "입니다.");
		
		sc.close();
		
		sc3.close();
	}

}
