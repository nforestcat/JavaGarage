package example;

public final class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] b =null;
		b = new boolean[10];
		
		char[] ch=null;
		ch = new char[10];
		int[] i = null;
		i = new int[10];
		/*i[0] = 0;
		i[1] = 1;
		i[2] = 2;
		i[3] = 3;
		i[4] = 4;
		i[5] = 5;
		i[6] = 6;
		i[7] = 7;
		i[8] = 8;
		i[9] = 9;*/
		int[] a=new int[] {1,2,3,4};
		for (int j = 0; j < 10; j++)
		{
			i[j]=j;
		
		}
		
		for (int j = 0; j < 10; j++)
		{
			System.out.println(i[j]);
		
		}
		int[] score= null;
		score=new int[5];
		for (int j = 0; j < 5 ; j++) 
		{
			score[j] = j*10;
			System.out.println(score[j]);
		}
		
		
	}

}
