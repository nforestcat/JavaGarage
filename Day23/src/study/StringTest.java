package study;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc".concat("def"));
		System.out.println("substring".substring(3, 9));
		String color = "red, blue, white";
		String[] arr = color.split(",");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("     trim() test:    ".trim());
		System.out.println("toLowerCase() test : ".toLowerCase());
		System.out.println("toUpperCase() test : ".toUpperCase());
		
		System.out.println("abcdefghijk".indexOf("def"));
		System.out.println("abcdefaghijkl".lastIndexOf("a"));
		
		System.out.println("on Air".contains("on"));
		
		System.out.println("replace() test: hello java".replace("java", "world"));
		
		System.out.println("abcdefg".endsWith("fg"));
		System.out.println("abcdefg".startsWith("abc"));
		
		System.out.println("abcdefg".compareTo("abcdefg"));
		System.out.println("abcdefg".compareTo("abcdefgh"));
		System.out.println("abcdefgh".compareTo("abcdefg"));
		System.out.println("abc".equals("abc"));
		
		
	
	}
}