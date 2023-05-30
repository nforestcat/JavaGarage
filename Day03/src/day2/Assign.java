package day2;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10, b = 0;
		b = a;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println(a + " + " + b + " = " + (a + b));
		float y = 3.14f;
		System.out.println("y = " +y);
		System.out.printf("floating-point:%.8f\n", y);//실수형, 소수점 8자리까지, 9번째 자리에서 반올림
		System.out.printf("floating-point:%020.8f\n" , y); //총 20자리, 소수점 아래 8자리까지 나머지는 0으로 채워줌
		System.out.printf("floating-point:%20.8f\n", y); //총 20자리
		System.out.printf("floating-point:%.8g\n", y);
		System.out.printf("floating-point:%.8e\n", y);
		String i = "hello java";
		System.out.println("String : " + i);
	}

}
