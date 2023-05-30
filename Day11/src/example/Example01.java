package example;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			if(i==0) {
				score[i]=0;
			} else {
			score[i]=score[i-1]+10;
			}
		}
		for( int i = 0; i < score.length; i++) {
			System.out.println("score["+ i +"] = "+ score[i]);
		}
		
	}

}
