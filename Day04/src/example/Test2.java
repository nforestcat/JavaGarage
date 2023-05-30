package example;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1= 'a';
		System.out.println(c1);
		System.out.println((int)c1);
		char c2= 'b';
		System.out.println(c2);
		System.out.println((int)c2);
		int c3=99;
		System.out.println(c3);
		System.out.println((char)c3);
		int c4=98;
		System.out.println(c4);
		System.out.println((char)c4);
		int c5 =65;
		System.out.println((char)c5);
		char c6 = 'c';
		c6++;
		//단항연산
		System.out.println(c6);
		char c7 = 'd';
		c7 = (char)(c7 +1);
		//이항연산 => 즉 casting이 필요
		System.out.println(c7);
		int a1= 75;
		int a2= 105;
		int a3= 109;
		int a4= 83;
		int a5= 101;
		int a6= 117;
		int a7= 110;
		int a8= 103;
		int a9= 106;
		int a10=105;
		/*System.out.print((char)a1);
		System.out.print((char)a2);
		System.out.print((char)a3);
		System.out.print((char)a4);
		System.out.print((char)a5);
		System.out.print((char)a6);
		System.out.print((char)a7);
		System.out.print((char)a8);
		System.out.print((char)a9);
		System.out.print((char)a10);
		System.out.print((char)a7);*/
		System.out.printf("%c%c%c %c%c%c%c%c%c%c%c", a1, a2, a3, a4, a5, a6, a7, a8 , a9, a10, a7);
		
	}

}
