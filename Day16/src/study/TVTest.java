package study;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t = new TV();
		t.setChannel(7);
		
		t.channelUp();
		System.out.println(t.getChannel());
		
		t.channelDown();
		System.out.println(t.getChannel());
		
		//TV t2 = new TV();
		//t2 메모리 할당 (주소값 t2 새로 부여)
		TV t2;
		//이렇게 하면 이름만 선언(null)(메모리값 없음)
		t2 = t;
		//t2와 t가 가르키는 곳이 같음 (주소값이 같아짐)
		t2.channelUp();
		System.out.println(t2.getChannel());
		t.channelUp();
		System.out.println(t.getChannel());
		
		
		TV[] tv = new TV[12];
	}
}