package example;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("멈추려면 1");
			i = sc.nextInt();
			if (i==1) {
				System.out.println("종료");
				break;
			}
			System.out.println(i);
		}
		sc.close();
	}

}
