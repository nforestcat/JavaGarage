package study;

class InitTest {

	
		int x= 5;
		static int y = 5;
		String str = "aaa";
		
		static {
			System.out.println("static 초기화 블록 실행전 \ny = " + y);
		}
		{
			System.out.println("초기화 블록 실행 전 \nx = " + x);
			System.out.println("y = " +y);
			System.out.println("str = "+ str);
			x = 20;
			y = 20;
			str = "bbb";
		}

	InitTest(){
		System.out.println("생성자 실행 전 \nx = " + x);
		System.out.println("y = " +y);
		System.out.println("str = "+ str);
		x = 30;
		y = 30;
		str = "ccc";
	}
	void print() {
		System.out.println("모든 초기화 후 \nx = " + x);
		System.out.println("y = " +y);
		System.out.println("str = "+ str);
	}

}
