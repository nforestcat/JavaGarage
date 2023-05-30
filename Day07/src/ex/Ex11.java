package ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int jumsu = sc.nextInt();
		if (jumsu >= 60) {
			System.out.println("합격");
		}	else {
			System.out.println("불합격");
		}
		sc.close();
		int python = 60, java = 70, android = 80, clang = 50, cpp = 30;
		System.out.println("나잘난의 성적 총 합계는 " + (python+java+android+clang+cpp) + " 평균은 " + (python+java+android+clang+cpp)/5 + "입니다.");
	}

}
