package example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 숫자");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i = 1; i < 10; i ++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		sc.close();
	}

}
