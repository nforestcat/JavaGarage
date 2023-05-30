package example;

public class Arrayexample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1, 2, 3};
		int[] a2 = new int[3];
		a2 = a;
		
		int i;
		for (i=0; i < a2.length ; i++) {
			System.out.println(a2[i]);
		}
		System.out.println("배열 a의 주소(참조값)"+ a);
		System.out.println("배열 a2의 주소(참조값)"+ a2);
		
		a2[0]=5;
		System.out.println(a2[0]);
		System.out.println(a[0]);

		
		int[] arr1 = new int[] {1, 2, 3};
		int[] arr2 = new int[4];
		
		for (i=0; i < arr1.length ; i++) {
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		
		System.out.println(arr2[3]);
		System.out.println("배열 arr1의 주소(참조값)"+ arr1);
		System.out.println("배열 arr2의 주소(참조값)"+ arr2);
		
		float[] f = new float[3];
		float[] f2 = f;
		f[0] = 3.14f;
		f[1] = 2.34f;
		f[2] = 9.08f;
		// f2[2] == 9.08
		System.out.println(f[2]);
		System.out.println(f2[2]);
	}

}
