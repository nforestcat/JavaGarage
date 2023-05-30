package function;

import java.util.Scanner;

public class Function01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = 1;
		int[][] bayeol22 = new int [5][5];
		for(int i = 0; i < bayeol22.length; i ++) {
			switch(i) {
			case 0: case 2: case 4:
				for(int j = 0; j< bayeol22.length; j++) {
					bayeol22[i][j] = v;
					v++;
				}
				break;
			case 1: case 3:
				for(int j = bayeol22.length - 1; j>= 0; j--) {
					bayeol22[i][j] = v;
					v++;
				}
				break;
			}
		}
		
		
		arrPrint(bayeol22);
		sc.close();
		
	}
	static void arrPrint(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
