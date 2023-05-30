package member;

public class Member{
	private String name;
	private String tel;
	private String address;
	private static Member m = new Member();
	
	private Member() {
		name = "no name";
		tel = "no tel";
		address = "no address";
	}
	public static Member getMember() {
		return m;
	}
	
	public void printMember() {
		System.out.println("name : "+ name);
		System.out.println("tel : "+ tel);
		System.out.println("address : "+ address);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}