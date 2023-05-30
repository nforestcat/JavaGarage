package example;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean power=false;
		char answer;
		int x = 5;
		String answer2 = "";
		
		//if (power == true) {
		//	answer = 'Y';
		//}	else answer = 'N';
		
		answer = (power == true)?'Y':'N';
		System.out.println(answer);
		
		answer2 = ((x % 2) == 0 )?"짝수입니다":"홀수입니다";
		System.out.println(answer2);
		
	}

}
