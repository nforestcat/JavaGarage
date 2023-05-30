package example;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int sum2=0;
		sum=0;
		sum2=0;
		int a=0;
		while(a<100) {
			a++;
			sum2+=a;
			sum+=sum2;
		}
		System.out.println(sum);
	}

}
