package study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberMain {

		public static void main(String[] args) {
			
			ArrayList<Member> al = new ArrayList<Member>();
//			Member m = new Member("둘리" , "010", "노원구");
//			System.out.println(m);
//			System.out.println(m.toString());
			MemberMenu mm=new MemberMenu();
			mm.menuProcess(al);
		}
}
class Member{
	private String name;
	private String tel;
	private String address;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getTel() {
		return tel;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	Member(){
		
	}
	Member(String name, String tel, String address){
		this.name=name;
		this.tel=tel;
		this.address=address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"/"+tel+"/"+address;
	}
	
		
	}
class MemberMenu{
	Scanner sc = new Scanner(System.in);


	void menuProcess(ArrayList<Member> data) {
		boolean isLoop = true;
		System.out.println("==================================");
		System.out.println("========멤버 관리 프로그램========");
		System.out.println("==================================");

		
		int menu = 0;
		int idx = 0;
		System.out.println();
		while(isLoop) {
			System.out.println("메뉴(1. 멤버추가 2.멤버검색 3.멤버수정 4. 멤버삭제 5.전체멤버 \r \n  6. 멤버 초기화 7. 종료)를 입력하세요.");
			menu = sc.nextInt();
			switch(menu) {
				case 1:
					//data.add(new Member("고희동", "017", "성북구"));
					data.add(infoInput());
					break;
				case 2:
					search(data);
					break;
				case 3:
					editMember(data);
					break;
				case 4:
					delMember(data);
					break;
				case 5:
					printAll(data);
					break;
				case 6:
					data.removeAll(data);
					System.out.println("데이터가 초기화되었습니다.");
					break;
				case 7:
					isLoop = false;
					break;
				default:
					System.out.println("잘못입력하셨습니다");
					break;
			}
			System.out.println("-----------------------------");
		}
		System.out.println("프로그램 종료");

	}
	Member infoInput() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String tel = sc.next();
		sc.nextLine(); //꼼수. sc변수 사용중에 위치가 안 맞아서 해당 값 소진 위해 사용
		System.out.print("주소 : ");
		String address  = sc.nextLine();
		return new Member(name, tel, address);
	}
	int search(ArrayList<Member> data) {
		int idx = -1;
		System.out.println("검색할 이름을 입력해주세요");
		String name = sc.next();
		int size = data.size();
		Member m = new Member();
		for( int i = 0; i < size; i++) {
			m = data.get(i);
			if (m.getName().equals(name)) {
				idx = i;
				break;
			}
		}
		//System.out.println(idx);
		if (idx == -1) {
			System.out.println("멤버를 찾을 수 없습니다.");
		}
		return idx;
	}
	void editMember(ArrayList<Member> data ) {
		int idx = search(data);
		if(idx == -1) {
			System.out.println("찾을 수 없습니다");
		} else {
			Member m = data.get(idx);
			System.out.println("기존 정보");
			System.out.println(m);
			System.out.println("새 번호");
			String tel = sc.next();
			sc.nextLine();
			System.out.println("새 주소");
			String address = sc.nextLine();
			
//			m.setTel(tel);
//			m.setAddress(address);
			m=new Member(m.getName(), tel, address);
			data.set(idx, m);
			System.out.println(m);
		}
	}
	void delMember(ArrayList<Member> data) {
		int idx = search(data);
		if(idx == -1) {
			System.out.println("찾을 수 없습니다");
		} else {
			data.remove(idx);
			System.out.println("삭제했습니다.");
		}
	}
	void printAll(ArrayList<Member> data) {
		for(int i = 0; i < data.size(); i++) {
			Member mr = data.get(i);
			printMember(mr);
		}
		Iterator<Member> iterator = data.iterator();
		while(iterator.hasNext()) {
			Member m = iterator.next();
			printMember(m);
			
		}
	}
	void printMember(Member m) {
		System.out.println(m.toString());
	}
	
}