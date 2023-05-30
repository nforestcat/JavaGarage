package ex;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		switch (a) {
		case 10:
			System.out.println("a는 10이다");
		case 20:
			System.out.println("a는 20이다");
		case 30:
			System.out.println("a는 30이다");
		default:
			System.out.println("그 외의 값");
		}
		//break;이 없으므로 a=10일 경우 a는 10이다 부터 default의 값 까지 전부 출력
		//a=20인 경우 a는 20이다 부터 끝까지
		//a=30인 경우 a는 30이다 부터 끝까지
		//a=40인 경우 그 외의 값 출력
	}

}
