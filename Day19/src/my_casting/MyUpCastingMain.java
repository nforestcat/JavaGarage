package my_casting;

public class MyUpCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parent p = new Child();	//업캐스팅: 부모타입으로 선언하고, 메모리 할당은 자손의 형태로 할당
								//재정의된 메소드가 실행
								//상위 클래스의 멤버만 사용 가능 (중요)
		p.print();				//Child의 print()
		System.out.println(p.name);		//o
		//System.out.println(p.hobby);	//x
		p.add();						//o
		//p.sub();						//x
		Child ch = (Child)p;			//업캐스팅이 된 p는 다운캐스팅이 가능함. 
										//(Child)p로 자손의 데이터타임으로 캐스팅하면 다운캐스팅. 상속관계에서만 가능함.
		ch.sub();						//o
		((Child)p).sub();				//o 윗줄과 같음
		
		System.out.println(ch.hobby);
		System.out.println(((Child)p).hobby);	//윗줄과 같음
		
		
	}
	

}
class Parent{
	String name;
	int add() {
		return 5;
	}
	void print() {
		System.out.println(name);
	}
}
class Child extends Parent{
	String hobby;
	void print() {
		System.out.println(name);
		System.out.println(hobby);
	}
	
	int sub() {
		return 4;
	}
}