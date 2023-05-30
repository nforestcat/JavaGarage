package study;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("키(cm)를 입력해주세요");
		int h = sc.nextInt();
		System.out.println("몸무게(kg)를 입력해주세요");
		int w = sc.nextInt();
		p1.setHeight(h);
		p1.setWeight(w);
		p1.setBMI();
		System.out.println("당신의 bmi 는 " +p1.getBMI());
		sc.close();
		
	}

}

class Person{
	int height; //멤버 변수 height //set , get
	int weight; //멤버 변수 weight // set, get
	float bmi; //멤버 변수 bmi //set, get
	void setHeight(int h) {
		if(h > 0 ) {
			height = h; //height의 값 받아옴
		}
	}
	int getHeight() {
		return height; //height 출력
	}
	void setWeight(int w) {
		if(w > 0) {
			weight = w; //weight의 값 받아옴
		}
	}
	int getWeight() { 
		return weight; //weight 출력
	}
	void setBMI(){
		//setBMI 호출 전 setHeight setWeight먼저 호출해야 함
		bmi = weight / (((float) (height / 100f)) * ((float) (height / 100f)));
		
	}
	float getBMI(){
		return bmi;
	}
	
}