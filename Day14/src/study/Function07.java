package study;

public class Function07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];
		score[0] = 100;
		score[1] = 90;
		score[2] = 100;
		score[3] = 90;
		score[4] = 14;
		
		//총점과 평균 구하기
		
		System.out.println("총점은 = " + sum(score));
		System.out.println("평균은 = " + avg(sum(score)));
		System.out.println("평균은 = " + avg2(score));
		
	}
	public static int sum(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			temp += arr[i];
		}
		return temp;
	}
	
	public static float avg(int sum) {
		float temp = 0;
		temp = sum / 5f;
		return temp;
	}
	
	public static float avg2(int[] arr) {
		float temp = 0;
		temp = sum(arr) / 5f;
		return temp;
	}

}
