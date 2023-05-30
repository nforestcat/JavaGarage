package ex;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주민번호를 입력하세요. ex) 012345-7890123");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char gender = str.charAt(7);
		System.out.println(gender);
		/*if (gender == '1' ||gender =='3') {
			System.out.println("남자");
		}	else if (gender == '2' || gender == '4') {
			System.out.println("여자");
		}	else {
			System.out.println("잘못입력하셨습니다.");
		}*/
		switch(gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		/*char location = str.charAt(8);
		switch(location) {
		case 1:
			System.out.println("서울");
			break;
		default:
			System.out.println("not 서울");
		}*/
		int sido = Integer.parseInt(str.substring(8,10));
		if(sido < 9) {
			System.out.println("서울");
		} else if (sido > 8 && sido < 13) {
			System.out.println("부산");
		} else if (sido > 12 && sido < 16) {
			System.out.println("인천");	
		} else if (sido >= 16 && sido <= 25) {
			System.out.println("경기도");	
		} else if (sido >= 26 && sido <= 34) {
			System.out.println("강원도");	
		} else if (sido >= 35 && sido <= 39) {
			System.out.println("충청북도");	
		} else if (sido == 40) {
			System.out.println("대전");	
		} else if (sido >= 41 && sido <= 47) {
			System.out.println("충청남도");	
		} else if (sido == 44 || sido == 96) {
			System.out.println("세종");	
		} else if (sido >= 48 && sido <= 54) {
			System.out.println("전라북도");	
		} else if (sido >= 55 && sido <= 64) {
			System.out.println("전라남도");	
		} else if (sido == 65 || sido == 66) {
			System.out.println("광주");	
		} else if (sido >= 67 && sido <= 70) {
			System.out.println("대구");	
		} else if (sido >= 71 && sido <= 80) {
			System.out.println("경상북도");	
		} else if (sido >= 81 && sido <= 84) {
			System.out.println("경상남도");	
		} else if (sido == 85) {
			System.out.println("울산");	
		} else if (sido >= 86 && sido <= 90) {
			System.out.println("경상남도");	
		} else if (sido >= 91 && sido <= 95) {
			System.out.println("제주도");	
		} 
		sc.close();
		
	}

}
