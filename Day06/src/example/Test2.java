package example;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -10;
		int absX = (x >= 0)? x: -x;
		System.out.println(absX);
		
		int score = 50;
		boolean b;
		char grade = (score >= 90)?'A':((score >= 80)? 'B':'C');
		b = (score >=80 && score < 90);
		//char grade = (b==true)?'B':((score>=90)?'A':'C')
		System.out.println(grade);
	}

}
