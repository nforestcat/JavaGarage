package study;

public class ThrowExcMain {
	public static void main(String[] args) {
		ThrowExc te = new ThrowExc();
		String str = te.subStr(2);
		System.out.println(str);
	}
}
class ThrowExc{
	String str = null;
	
	public String subStr(int idx) {
		if (str == null) {
			System.out.println("str이 null이다");
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return str.substring(idx);
		}
	}
}