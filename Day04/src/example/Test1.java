package example;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c = 0;
		c = (byte) (a+b); //byte + byte => int + int => int
		// int c = (a+b)
		System.out.println(c);
		long l = 0;
		int i = 0, j = 0;
		i++;
		j = (int) (i + l);
		System.out.println(j);
	}

}
