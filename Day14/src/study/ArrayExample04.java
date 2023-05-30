package study;

public class ArrayExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int [45];
		int v = 1;
		for(int i = 0; i < num.length; i++) {
			num[i] = v;
			
			v++;
			System.out.print(num[i] + "\t");
			if( i%5== 4) {
				System.out.println();
			}
		}
		int j = 0;
		int k = 0;
		int temp = 0;
		for(int i = 0; i < 10; i++) {
			j=0;
			k=0;
			temp=0;
			while(j == k ) {
				j =(int) (Math.random()*45);
				k =(int) (Math.random()*45);
			}
			temp = num[j];
			num[j] = num[k];
			num[k] = temp;	
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
			if( i%5== 4) {
				System.out.println();
			}
		}
	}

}
