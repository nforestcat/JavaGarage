package study;

import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		boolean correct = true;
		Random rnd = new Random();
		int answer = rnd.nextInt(100)+1;
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-100사이의 숫자를 입력하세요");
		int num2 = 0;
		while(correct) {
			try {
				num = sc.nextInt();
				if(num > answer) {
					System.out.println("더 작은 수를 입력하세요");
				} else if(num < answer)  {
					System.out.println("더 큰 수를 입력하세요");
				} else {
					correct = false;
				}	
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("1회 에러입니다. 숫자를 입력해주세요. 다음은 없습니다.");
				try {
					num = scanner.nextInt();
					if(num > answer) {
						System.out.println("더 작은 수를 입력하세요");
					} else if(num < answer)  {
						System.out.println("더 큰 수를 입력하세요");
					} else {
						correct = false;
					}	
				} catch (Exception e2) {
					// TODO: handle exception
					correct = false;
				}
				
			}
			
		} 
		if(num == answer)System.out.println("정답입니다.");
		else {
			System.out.println("2번째 에러입니다. 종료합니다.");
		}
		System.out.println("답은 바로 "+answer);
		sc.close();	
	}
		
}


