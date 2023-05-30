package yy;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor pf = new Professor("IoT과");
		System.out.println(pf.name);
		System.out.println(pf.dept);
		
	}

}
class Person2{
	String name;
	Person2(){
		
	}
	Person2(String name){
		this.name = name;
	}
}

class Professor extends Person2{
	String dept;
	Professor(String dept){
		super("홍길동");
		//아무것도 적지 않으면 super(); 기본적으로 default생성자를 불러옴
		//아니면 이렇게 입력해서 불러올 수 있음
		this.dept = dept;
	}
}