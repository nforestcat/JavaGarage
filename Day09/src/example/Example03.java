package example;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0;
		int sum = 0;
		for(a = 1; a<=100; a++) {
			if(a%2==0) {
				sum -=a;
			} else {
			sum += a;
			}
		}
		System.out.println(sum);
		
		a = 0;
		sum = 0;
		while(a<=100) {
			if(a%2==0) {
				sum -=a;
			} else {
			sum += a;
			}
			a++;
		}
		System.out.println(sum);
		
		int answer=1;
		for (a=1; a<=10; a++) {
			if(a%2!=0) {
				answer*=(-a);
			} else {
				answer*=a;
			}
		}
		System.out.println(answer);
		
		sum=0;
		for (int j = 1; j<=100; j++) {
			sum += j;
			if (sum>100) {
				System.out.println(j);
				System.out.println(sum);
				break;
			}
		}
		sum = 0;
		a = 1;
		while(a<=100) {
			sum += a;
			if (sum>100) {
				System.out.println(a);
				System.out.println(sum);
				break;
			}
			a++;
		}
		
		sum = 0;
		int sum2=0;
		for (int i = 1; i <=100; i++) {
			sum2=0;
			for (int j = 1; j <= i; j++) {
				sum2+=j;
			}
			sum+=sum2;
		}
		System.out.println(sum);
		
		sum=0;
		sum2=0;
		for (int i = 1; i <=100; i++) {
			sum2+=i;
			sum+=sum2;
		}
		System.out.println(sum);
		
		sum=0;
		sum2=0;
		a=0;
		while(a<100) {
			a++;
			sum2+=a;
			sum+=sum2;
		}
		System.out.println(sum);
	}

}
