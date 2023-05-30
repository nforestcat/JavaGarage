package study;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1 = new Student();
		 s1.name="장동건";
		 s1.korean_score=90;
		 s1.math_score=100;
		 s1.english_score=80;
		 s1.sum();
		 s1.average();
		 
		 
		 Student s2 = new Student();
		 s2.name = "현빈";
		 s2.korean_score=90;
		 s2.english_score=80;
		 s2.math_score=70;
		 s2.sum();
		 s2.average();
		 
		 Student s3 = new Student();
		 s3.name = "아이유";
		 s3.korean_score=100;
		 s3.english_score=100;
		 s3.math_score=100;
		 s3.sum();
		 s3.average();
	}
	
}
class Student {
	String name; //이름
    int age; //나이
    int korean_score; //국어성적
    int math_score; //수학성적
    int english_score; //영어성적
    //int total_score = korean_score + math_score + english_score; //총점 //이렇게도 쓸 수는 있음;
    int total_score;
    float avg; //평균
    
    /*public static int sum(int korean_score, int english_score, int math_score){
    	return korean_score+english_score+math_score;
    }*/
    void sum() {
    	total_score = korean_score + english_score + math_score;
    	System.out.println(total_score);
    }
    void average() {
    	sum();
    	avg = total_score / 3f;
    	System.out.println(avg);
    }

}
