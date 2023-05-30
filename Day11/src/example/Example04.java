package example;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		int key = 8;
		
		for ( int i = 0; i<a.length; i++) {
			a[i] = i;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if( key == a[i]) {
				System.out.println("key찾음");
				break;
			}
		}
	}

}
