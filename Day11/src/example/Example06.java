package example;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int temp = 0;
		System.out.println("정수를 입력해주세요");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (i == 0) {
				temp = num[i];
			} else {
				if(num[i-1]<num[i]) {
					temp = num[i];
					
				} else {
					temp = num[i-1];
				}
				
			}
		}
		System.out.println("가장 큰 값은 : "+temp);
		sc.close();
	}

}
