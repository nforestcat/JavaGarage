package study;

public class WrapTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapTest t = new WrapTest();
		
		t.add(Integer.valueOf(10));
		t.add(Integer.valueOf(25));
		t.add(35);
		t.add(Float.valueOf(3.56f));
		t.add(Float.valueOf(56.123f));
		t.add(456.123f);
		t.print();
		System.out.println();
		
		String str1 = "123";
		String str2 = "456";
		int x = Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		System.out.println(x+y);
		System.out.println(str1+str2);
		
		Character obj_ch = Character.valueOf('a');
		char ch = obj_ch.charValue();
		System.out.println(obj_ch);
		//unboxing
		System.out.println(ch);
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('A'));
		}

}
class WrapTest{
	public Object[] arr = new Object[10];
	public int cnt;
	public void add(Object obj) {
		arr[cnt++] = obj;
	}
	public void print() {
		int i;
		for (i = 0; i < cnt; i++) {
			Object o = arr[i];
			if (o instanceof Integer) {
				System.out.println("Integer의 객체");
				System.out.println(((Integer)o).intValue());
			} else if(o instanceof Float) {
				System.out.println("Float의 객체");
				System.out.println(((Float)o).floatValue());
			}
		}
	}
}