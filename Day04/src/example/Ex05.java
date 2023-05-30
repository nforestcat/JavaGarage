package example;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7, num2 = 7;
		int result1, result2;
		result1 = --num1 + 4;
		//result1 = 6 + 4 = 10
		//num1 = 6
		result2 = num2-- + 4;
		//result2 = 7 + 4 = 11
		//num2 = 6
		
		System.out.println("전위 감소 연산자에 의한 결과 : " + result1 + ", 변수의 값 : "+ num1);
		System.out.println("후위 감소 연산자에 의한 결과 : " + result2 + ", 변수의 값 : "+ num2);
	}

}
