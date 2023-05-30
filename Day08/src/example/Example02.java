package example;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 1; i<=100 ; i++) {
			
			if(i % 2 != 0) {
				num+=i;
				System.out.printf("%d\t",i);
			}
			if(i % 10 == 0) {
				System.out.printf("\n");
			}
			
		}
		System.out.println("1~100까지의 홀수합");
		System.out.println("sum="+num);
	}

}
