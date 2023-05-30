package example;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bag=null;
		bag = new int[100];
		int sum = 0;
		for(int i = 0;i<100;i++) 
		{
			bag[i] = i+1;
			sum += bag[i];
		}
		System.out.println(sum);
		
		sum=0;
		
		int[] a = new int[] {2, 10, 8, 5, 3, 9};
		for(int i = 0; i < 6; i++) 
		{
			sum += a[i];
		}
		System.out.println(sum);
		
		char[] ch = new char[] {'a', 'p', 'p', 'l', 'e'};
		for (int i = 0; i < 5; i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		for (int i = 4; i >= 0; i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		int[] tenth = new int[10];
		for (int i = 0; i<tenth.length; i++) {
			if(i==0) {
				tenth[i] = 1;
			} else {
				tenth[i]=tenth[i-1]*10;
			}
			System.out.println(tenth[i]);
		}
		
		sum=0;
		for(int i = 0; i < tenth.length; i++) {
			sum+=tenth[i];
		}
		System.out.println(sum);
		
		int temp = 0;
		for (int i = 0; i < tenth.length-1; i++) {
			if(tenth[i]<tenth[i+1]) {
				temp = tenth[i+1];
			} else {
				temp = tenth[i];
			}
		}
		System.out.println(temp);
		
		
	}

}
