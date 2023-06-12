package study;

public class ADDrDBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBMain program = new DBMain();
		program.process();
	}
	

}
class Member{
	private int num;
	private String name;
	private String tel;
	private String address;
	public Member(int num, String name, String tel, String address) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
		this.address = address;
		toString();
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public String toString() {
		return num+" / "+name + " / " +tel + " / " +address;
	}
}