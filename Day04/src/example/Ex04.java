package example;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = x-- + 5 + --x;
		// y = 10 + 5 + 8
		//x= 8
		System.out.println("x : "+ x + ", y : " + y);
	}

}
