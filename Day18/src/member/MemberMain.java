package member;

public class MemberMain {

	public static void main(String[] args) {
		Member m = Member.getMember();
		
		m.setName("김병만");
		m.setTel("5555");
		m.setAddress("서울시");
		
		String name = m.getName();
		String tel = m.getTel();
		String address = m.getAddress();
		
		System.out.println("name : "+ name);
		System.out.println("tel : "+ tel);
		System.out.println("address : "+ address);
		
		m.printMember();
	}
	
}
