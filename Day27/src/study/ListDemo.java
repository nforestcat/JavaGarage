package study;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList<>();
		list.add("jung");
		list.add("park");
		list.add("kang");
		list.add("han");
		list.add("heo");
		list.add(3, "lim");
		list.set(4, "ko");
		for(int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
		

	}

}
