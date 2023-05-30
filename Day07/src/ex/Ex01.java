package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 값을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int absX = (x>0)?x:-x;
		System.out.println("절대값은 " + absX+"입니다");
		sc.close();
	}

}
