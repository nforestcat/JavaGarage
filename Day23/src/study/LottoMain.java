package study;

import java.util.*;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		int i = 0;
		Random rnd = new Random();
		do {
			lotto[i] = (rnd.nextInt(45)+1);
			
			 
			for(int j = 0; j <= i; j++) {
				if(lotto[j]== lotto[i] && j!=i ) {
					i--;
					
				}
			}
			i++;
		}while(i<6);
		for(int j=0; j<lotto.length; j++) {
			System.out.print(lotto[j]+ "\t");
		}
		
	}

}
