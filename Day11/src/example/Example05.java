package example;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for(i = 0; i< 10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		int[] a = new int[6];
		for (i = 0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		
		int[] num = new int[5];
		for(i = 0; i<num.length; i++) {
			if(i == 0) {
				num[i]=1;
			} else {
				num[i] = num[i-1]*10;
			}
			System.out.println(num[i]);
		}
		
		int[] numb = new int[6];
		for(i = 0; i <numb.length ; i++) {
			numb[i] = 1;
			System.out.println(numb[i]);
		}
		
		int[] number = new int[6];
		for(i = 0; i < number.length; i++) {
			number[i] = i+1;
			System.out.println(number[i]);
		}
		
		int[] numbe = new int[6];
		for(i = 0; i < numbe.length; i++) {
			numbe[i] = 1 + (i * 2);
			System.out.println(numbe[i]);
		}
		
		int[] nu = new int[6];
		for (i = 0; i < nu.length; i++) {
			nu[i] = 10 + (i*10);
			System.out.println(nu[i]);
		}
		
		int[] n = new int [10];
		for (i = 0; i < n.length; i++) {
			n[i] = i*i;
			if(i % 2 == 1) {
				System.out.println(n[i]);
			}
		}
	}

}
