package example;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for (a=1; a<6; ++a) {
			System.out.print(a);
		}
		a = 0;
		while(a<5) {
			System.out.print(++a);
		}
		a = 0;
		do {
			System.out.print(++a);
		} while(a<5);
		a=0;
		System.out.print("\n");
		for (int i = 0; i < 20; i++) {
			System.out.println("고길동"+(i+1));
		}
		for (int i = 0; i < 120; i++) {
			System.out.println((i)+"고희동"+(i+3));
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println("예");
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("yes");
		}
		for(int i = 0; i < 10; i++) {
			if (i == 4) {
				System.out.println("*");
				continue;
			}
			System.out.println(i);
		}
		int num = 1;
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				num *= -i;
			} else {
				num *= i;
			}
			System.out.println(i);
			System.out.println(num);
		}
		a = 89;
		if (a >= 60) {
			System.out.println("합격");
		} else if( a >= 50) {
			System.out.println("예비후보");
		} else {
			System.out.println("불합격");
		}
	}

}
