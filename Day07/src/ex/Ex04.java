package ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("가로는?");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		System.out.println("세로는?");
		Scanner sc2 = new Scanner(System.in);
		int l = sc2.nextInt();
		System.out.println("높이는?");
		Scanner sc3 = new Scanner(System.in);
		int h = sc3.nextInt();
		int v = w * l * h;
		System.out.println("정사각 기둥의 부피는 " + v + "입니다.");
		
		sc.close();
		sc2.close();
		sc3.close();
	}

}
