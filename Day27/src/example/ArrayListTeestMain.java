package example;
import java.util.*;
public class ArrayListTeestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<String> al  = new ArrayList<String>();
		
		al.add("aaa");
		al.add("bbb");
		al.add(1, "ccc");
		al.set(2, "fff");
		
		for(int i = 0; i <al.size(); i++) {
			System.out.println(i+"번째 요소 : "+al.get(i));
		}
		
		System.out.println("검색할 값을 입력해주세요");
		String srh = sc.nextLine();
		int idx = 0;
		if(al.contains(srh)) {
			idx=al.indexOf(srh);
			System.out.println(idx + "위치에서 "+ al.get(idx)+" 검색");
		} else {
			System.out.println("찾을 수 없음");
		}
		System.out.println("삭제할 값을 입력해주세요");
		srh = sc.nextLine();
		idx = 0;
		if(al.contains(srh)) {
			idx = al.indexOf(srh);
			al.remove(idx);
		} else {
			System.out.println("해당하는 값이 없습니다.");
		}
		for(int i = 0; i < al.size(); i++) {
			System.out.println(i+"번째 요소 : "+ al.get(i));
		}
		System.out.println("전체 삭제");
		al.removeAll(al);
		
		if(al.isEmpty()) {
			System.out.println("리스트가 비어있습니다");
		} else {
			for(int i = 0; i < al.size(); i++) {
				System.out.println(i+"번째 요소 : "+ al.get(i));
			}
		}
		
	}

}
