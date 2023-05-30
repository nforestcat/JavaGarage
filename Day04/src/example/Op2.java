package example;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 0;
		j=i++;
		//j=5
		//i=6
		System.out.println("j="+j);
		j=++i;
		//i=7
		//j=7
		System.out.println("j="+j);
		j=i--;
		//j=7
		//i=6
		System.out.println("j="+j);
		j=--i;
		//i=5
		//j=5
		System.out.println("j="+j);
		System.out.println("현재 i=" +i);
		System.out.println("i++ : "+ i++);
		System.out.println("++i : "+(++i));
		System.out.println("i-- : " + i--);
		System.out.println("--i : " + (--i));
	}

}
