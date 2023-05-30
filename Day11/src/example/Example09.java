package example;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 50, 39, 25, 90, 11, 100, 44, 38, 99};
		int[] b = new int[10];
		
		b=a;
		/*
		 * 
		 * for (i = 0; i < a.length; i++) {
			b[i] = a[i];
		}*/
		int i = 0;
		for (i = 0; i < b.length; i++) {
			if(b[i] == 100) {
				System.out.println(i);
				break;
			}
		}
		
		String[] c = {"싸이", "트와이스", "소녀시대", "BTS","아이유", "브레이브걸스", "로제", "에이핑크", "저스틴비버","빈칸"};
		System.out.println(c[i]);
	}

}
