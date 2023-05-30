package study;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Example17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//근데 빙고가 뭔 게임임?
		// 일단 인터넷 검색한 거로 하면 55 배열에 랜덤 숫자 넣고
		// 숫자 입력하면 그 숫자 지워지고
		// 지워진 게 한 줄 되면 빙고하면서 끝나는건가
		int[][] bingoPan = new int[5][5];
		int[] randomSave = new int[25];
		int temp;
		boolean reroll;
		int i = 0;
		int j = 0;
		int k = 0;
		do {
			temp = randomNum();
			reroll = false;
			randomSave[i] = temp;
			if(i == 0) {
				i++;
				continue;
			} 
			else {
				for(j = 0; j < randomSave.length; j++) {
					if(randomSave[j]==temp && i != j) {
						reroll = true;
						break;
					}
				}
			}
			if(reroll) {
				i--;
			}
			i++;
		} while(i < randomSave.length);
		
		for(i = 0; i < bingoPan.length; i++) {
			for(j = 0; j < bingoPan[i].length; j++) {
				bingoPan[i][j] = randomSave[k];
				k++;
			}
		}
		for(i = 0; i < bingoPan.length; i++) {
			for(j = 0; j < bingoPan[i].length; j++) {
				System.out.print(bingoPan[i][j]+"\t");
			}
			System.out.println();	 
		}
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int checker = 0;
		int bgchk = 0;
		int num = 0;
		do {
			System.out.print("숫자입력");
			num = sc.nextInt();
			
				
			
			for (i = 0; i < bingoPan.length; i++) {
				for (j = 0; j < bingoPan.length; j++) {
	
					if (bingoPan[i][j] == num) { // 입력 숫자와 빙고판 숫자 비교

						
						bingoPan[i][j] = 0;

						for (x = 0; x < bingoPan.length; x++) { // bingo2 값 체크를 위한 for문
							for (y = 0; y < bingoPan[i].length; y++) {
								System.out.print(bingoPan[x][y]+"\t");
								
							}

							System.out.println();
						}

					}

				}
				System.out.println();
			}
			for(i = 0; i < bingoPan.length; i++) {
				for(j = 0; j < bingoPan[i].length; j++) {
					System.out.print(bingoPan[i][j]+"\t");
				}
				System.out.println();	 
			}
			
			for(i = 0; i < bingoPan.length; i++) {
				for(j=0; j<bingoPan[i].length; j++) {
					if(bingoPan[i][j] == 0) {
						checker++;
					}
					
					if(checker ==5) {
						bgchk++;
					}
				}
				checker = 0;
			}
			for(i = 0; i < bingoPan.length; i++) {
				for(j=0; j<bingoPan[i].length; j++) {
					if(bingoPan[j][i] == 0) {
						checker++;
					}
					if(checker ==5) {
						bgchk++;
					}
				}
				checker = 0;
			}
			if (bingoPan[0][0] == 0 && bingoPan[1][1] == 0 && bingoPan[2][2] == 0 && bingoPan[3][3] == 0 && bingoPan[4][4] == 0)
				++bgchk;
			if (bingoPan[0][4] == 0 && bingoPan[1][3] == 0 && bingoPan[2][2] == 0 && bingoPan[3][1] == 0 && bingoPan[4][0] == 0)
				++bgchk;
			if (bgchk == 1) {
				System.out.println(" 1빙고");
				bgchk = 0;
			} else if (bgchk == 2) {
				System.out.println(" 2빙고");
				bgchk = 0;

			} else if (bgchk == 3) {
				System.out.println(" 3빙고");
				bgchk = 0;
				
			} else if (bgchk == 4) {
				System.out.println(" 4빙고");
				bgchk = 0;

			} else if (bgchk == 5) {
				System.out.println(" 5빙고! 빙고 끝!");
				break;
			
			}
		}while(bgchk <= 5);
		sc.close();
	}
	
	static int randomNum() {
		Random random = new Random(); // 랜덤 객체 생성
		random.setSeed(System.currentTimeMillis());
		return (random.nextInt(25) + 1);
	}
	

}
