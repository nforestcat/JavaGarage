package study;

import java.util.Scanner;

public class MyExceptionMain2 {
	public static void main(String[] args) throws MyException{
		int cnt = 0;
		int[] arr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 크기를 입력하세요");
		cnt = sc.nextInt();
		new MyException(5);
//		if (cnt < 5) {
//			try {
//				throw new MyException(5);
//			} catch( MyException e) {
//				e.printStackTrace();
//			} finally {
//				sc.close();
//			}
//		} else {
//			System.out.println("크기가 "+ cnt+ "인 배열이 만들어졌습니다.");
//			arr = new int[cnt];
//		}
		sc.close();
	}
}
