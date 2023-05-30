package study;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][4];
		int[][] b = new int[2][4];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 9 + 1);
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				b[i][j] = (int) (Math.random() * 9 + 1);
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------");
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------");
		
		int[][] c = sum(a, b);
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------");
		
		int[][] d = mult(a, b);
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
			}
			System.out.println("");
		}
		
		
		
	}
	
	public static int[][] sum(int[][] arr, int[][] arr2) {
		int[][] a = new int[2][4];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				a[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		return a;
	}
	
	public static int[][] mult(int[][] arr, int[][] arr2) {
		int[][] a = new int[2][4];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				a[i][j] = arr[i][j] * arr2[i][j];
			}
		}
		return a;
	}

}
