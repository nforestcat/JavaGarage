package day2;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		float b = 13;
		
		float c = 0;
		//강제 형변환(casting)
		//float 타입의 c변수의 값을 int 타입의 a변수에 할당하므로,
		//큰 타입의 값을 작은 타입에 할당이 안되므로, 강제로 타입을 바꾸어주어야함.
		//casting연산자 (int)c; 와 같이 캐스팅 연산자()를 사용하여 바꿔주어 할당.
		//큰 데이터타입의 값이 작은 데이터 타입의 값으로 할당되니, 데이터 일부가 손실이 될 수 있음
		//a = c;
		c = (a + b) / 2;

		
		System.out.println("a = "+ a);
		System.out.println("c = "+ c);

	}

}
