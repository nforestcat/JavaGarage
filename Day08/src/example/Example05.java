package example;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 1, i = 1;
		for (i = 0; i < 10; i ++) {
			
			for(dan=2; dan < 10; dan++) {
				if(i == 0) {
					System.out.print(dan+"단"+"\t");
					continue;
				}
				System.out.print(dan+"*"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
	}

}
