package example;

public class Escape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("10 == 10.0f \t %b\n", 10==10.0f);
		System.out.printf("'0' == 0 \t %b\n", '0'==0);
		System.out.printf("'\\0' != 0 \t %b\n", '\0'== 0);
		System.out.printf("'A' == 65 \t %b\n", 'A'== 65);
		System.out.printf("'A' == 'B' \t %b\n", 'A'=='B');
		System.out.printf("'A' + 1 != 'B' \t %b\n", 'A'+1 != 'B');
		char a = 0xAE40;
		System.out.println(a);
		System.out.println('\uAE40'); //유니코드 표기법. 가급적 이렇게
		System.out.printf("3 | 5 = \t %d\n", 3|5);
		System.out.printf("3 & 5 = \t %d\n", 3&5);
		System.out.printf("3 ^ 5 = \t %d\n", 3^5);
		// a >= 0 && a < 10;
		// a != 0;
		// a >= 10 || a == 0;
		// a >= 5 && a < 10;
	}

}
