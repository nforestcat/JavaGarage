package study;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewStudent n = new NewStudent();
		n.setName("고길동");
		n.setBan(4);
		n.setNo(21);
		n.setMusic(100);
		n.setMath (10);
	}

}
class NewStudent{
	String name;
	int ban;
	int no;
	int music;
	int math;
	void setName(String n) {
		name = n;
	}
	String getName() {
		return name;
	}
	void setBan(int b) {
		ban = b;
	}
	int getBan() {
		return ban;
	}
	void setNo(int n) {
		no = n;
	}
	int getNo() {
		return no;
	}
	void setMusic(int mu) {
		music = mu;
	}
	int getMusic() {
		return music;
	}
	void setMath(int m) {
		math = m;
	}
	int getMath() {
		return math;
	}
}
