package study;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arr = new Object[5];
		int i;
		arr[0] = 15;
		arr[1] = 3.445f;
		arr[2] = 'x';
		arr[3] = "abc";
		arr[4] = true;
		for(i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		String str1 = "abc";
		String str2 = String.valueOf("def");
		char[] arr1 = {'g', 'h'};
		String str3 = new String(arr1);
		String str4 = new String();
		
		int k = Integer.valueOf("123").intValue();
		float f = Float.valueOf("23.5").floatValue();
		int x = Integer.parseInt("123");
		float y = Float.parseFloat("23.5");
		
		i = 5;
		String str5 = ""+i;
		String str6 = String.valueOf(10);
		i = 15;
		double d = 15.6;
		String str7 = Integer.toString(i);
		String str8 = Double.toString(d);
	}

}
