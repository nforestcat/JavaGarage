package study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

		public static void main(String[] args) {
			
			HashSet<String> setA = new HashSet<String>();
			setA.add("우유");
			setA.add("빵");
			setA.add("우유");
			setA.add("콜라");
			
			Iterator<String> data = setA.iterator();
			while(data.hasNext()) {
				System.out.println("setA data " + data.next());
			}
			System.out.println("-----------------------------------");
			
			HashSet<String> setB = new HashSet<String>();
			setB.add("우유");
			setB.add("빵");
			setB.add("초코");
			setB.add("고기");
			
			data = setB.iterator();
			while(data.hasNext()) {
				System.out.println("setA data " + data.next());
			}
			System.out.println("-----------------------------------");
			
			setA.addAll(setB);		//합집합
			//setA.retainAll(setB);	//교집합
			//setA.removeALl(setB);	//차집합
			//setA.clear()			//비우기
			
			data = setA.iterator();
			while(data.hasNext()) {
				System.out.println("setA data " + data.next());
			}
		}
}
