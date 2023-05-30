package example;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mathScore = new int[5];
		System.out.println("5명의 수학 점수를 입력해주세요");
		for(int i = 0; i < mathScore.length; i++) {
			mathScore[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < mathScore.length; i++) {
			sum += mathScore[i];
		}
		System.out.println("총점은 : "+sum);
		float average = (float) (sum / 5);
		System.out.println("평균은 : " + average);
		sc.close();
	}

}
