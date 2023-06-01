package example;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test;
		test = new int[5];
		System.out.println("main()");
		System.out.println("배열의 값을 넣겠습니다.");
		try {
			test[10] = 90;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("무사히 종료했습니다.");
	}

}


