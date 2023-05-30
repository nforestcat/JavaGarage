package example;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=0, k=0;
		for (i=0; i < 10; i++) {
			for (j=0; j<3; j++) {
				System.out.print(++k + "\t");
				if (k == 10) {
					//System.out.print("check");
					break;
				}
			}
			System.out.println();
		}
	}

}
