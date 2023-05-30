package study;

import java.util.Scanner;
public class ArrayExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5장 7번
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)((Math.random() * 10) + 1);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 값(1~10)을 입력하세요");
		int num = sc.nextInt();
		for(int i = 0; i < a.length; i++) {
			if(num == a[i]) {
				System.out.println("인덱스 " + i +" 에서 검색.");
			} /*else {
				System.out.println("찾지 못함");
			}*/
		}
		sc.close();
	}

}
