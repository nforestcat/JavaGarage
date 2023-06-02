package study;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("kim");
		list.add("ko");
		list.add("Lee");
		
		for(int i = 0; i < list.size(); i++) {
			String str3 = (String)list.get(i);
			System.out.println(str3);
			
		}
		try {
			list.add(5);
			String str = (String)list.get(0);
			int str2 = (int)list.get(3);
			System.out.print(str2);
		}catch(ClassCastException e) {
			
			list.add("5");
			String str = (String)list.get(0);
			String str2 = (String)list.get(3);
			System.out.print(str2);
			e.printStackTrace();
		}
		list.add(100);
		list.add("100");
		list.add('a');
		list.add(true);
		list.add((5>100));
		int str3 = (int)list.get(4);
		String str4 = (String)list.get(5);
		char str5 = (char)list.get(6);
		boolean str6 = (boolean)list.get(7);
		boolean str7 = (boolean)list.get(8);

	}
}
