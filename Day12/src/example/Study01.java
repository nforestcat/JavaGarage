package example;

public class Study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2D Array
		int[][] student = null;
		student = new int[2][3];
		//student = new int[2][];
		//student[0] = new int[3];
		//student[1] = new int[3];
		
		int[] a = new int[3];
		System.out.println(a.length);
		
		System.out.println(student.length);
		System.out.println(student[0].length);
		
		//student[0][0] = 90;
		//student[0][1] = 80;
		//student[0][2] = 70;
		
		/*for(int i = 0; i < student[0].length; i++) {
			student[0][i] = 90;
		}
		
		//student[1][0] = 100;
		//student[1][1] = 70;
		//student[1][2] = 80;
		
		for(int i = 0; i < student[1].length; i++) {
			student[1][i] = 100;
		}
		*/
		int[][] array35 = null;
		array35 = new int[3][5];
		// int[][] array35 = new int [3][5];
		// array35 = new int [3][];
		// array35[0] = new int [5];
		// array35[1] = new int [5];
		// array35[2] = new int [5];
		
		for(int i = 0; i < array35.length;i++) {
			for(int j = 0; j < array35[i].length; j++){
				array35[i][j] = 100;
			}
		}
		
		int[][] arr = new int [2][3];
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = i * 3 + j + 1;
			}
		}
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[i].length; j++){
				System.out.print("arr["+i+"]["+j+"] = " +arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		//선언 메모리할당 기본 타입은 제외(reference타입은 해줘야함)
		
		System.out.println();
		
		int [][] matrix = new int [3][];
		
		matrix[0] = new int [4];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		
		matrix[1] = new int [2];
		matrix[1][0] = 5;
		matrix[1][1] = 6;
		
		matrix[2] = new int [3];
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print("matrix["+i+"]["+j+"] = " +matrix[i][j] + "\t");
			}
			System.out.println();
		}
		int v = 1;
		int[][] bayeol = new int [5][5];
		for(int i = 0; i < bayeol.length; i++) {
			for (int j = 0; j < bayeol.length; j++) {
				bayeol[i][j] = v++;
			}
		}
		System.out.println("배열 1 x");
		for(int i = 0; i < bayeol.length; i++) {
			for (int j = 0; j < bayeol.length; j++) {
				System.out.print(bayeol[i][j] + "\t");
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol2 = new int [5][5];
		for(int i = 0; i < bayeol2.length; i++) {
			for (int j = 0; j < bayeol2.length; j++) {
				bayeol2[i][j] = (v * 2);
				v++;
			}
		}
		System.out.println("배열 2 2x");
		for(int i = 0; i < bayeol2.length; i++) {
			for (int j = 0; j < bayeol2.length; j++) {
				if(bayeol2[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol2[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		v = 0;
		int[][] bayeol3 = new int [5][5];
		for(int i = 0; i < bayeol3.length; i++) {
			for (int j = 0; j < bayeol3.length; j++) {
				bayeol3[i][j] = (v * 3) + 1;
				v++;
			}
		}
		System.out.println("배열 3 3x+1");
		for(int i = 0; i < bayeol3.length; i++) {
			for (int j = 0; j < bayeol3.length; j++) {
				if(bayeol3[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol3[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		v = 0;
		int[][] bayeol4 = new int [5][5];
		for(int i = 0; i < bayeol4.length; i++) {
			for (int j = 0; j < bayeol4.length; j++) {
				bayeol4[i][j] = (v * 2) + 1;
				v++;
			}
		}
		System.out.println("배열 4 2x+1");
		for(int i = 0; i < bayeol4.length; i++) {
			for (int j = 0; j < bayeol4.length; j++) {
				if(bayeol4[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol4[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol5 = new int [5][5];
		for(int i = 0; i < bayeol5.length; i++) {
			for (int j = 0; j < bayeol5.length; j++) {
				bayeol5[i][j] = (v * v) ;
				v++;
			}
		}
		System.out.println("배열 5 제곱");
		for(int i = 0; i < bayeol5.length; i++) {
			for (int j = 0; j < bayeol5.length; j++) {
				if(bayeol5[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol5[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		v = 25;
		
		int[][] bayeol6 = new int [5][5];
		for(int i = 0; i < bayeol6.length; i++) {
			for (int j = 0; j < bayeol6.length; j++) {
				bayeol6[i][j] = v ;
				v--;
			}
		}
		System.out.println("배열 6 역순");
		for(int i = 0; i < bayeol6.length; i++) {
			for (int j = 0; j < bayeol6.length; j++) {
				if(bayeol6[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol6[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol7 = new int [5][5];
		for(int i = 0; i < bayeol7.length; i++) {
			for (int j = 0; j < bayeol7.length; j++) {
				bayeol7[i][j] = v++;
			}
			v = 1;
		}
		System.out.println("배열 7 가로 12345");
		for(int i = 0; i < bayeol7.length; i++) {
			for (int j = 0; j < bayeol7.length; j++) {
				if(bayeol7[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol7[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol8 = new int [5][5];
		for(int i = 0; i < bayeol8.length; i++) {
			for (int j = 0; j < bayeol8.length; j++) {
				bayeol8[j][i] = v++;
			}
			
		}
		System.out.println("배열 8 세로쓰기");
		for(int i = 0; i < bayeol8.length; i++) {
			for (int j = 0; j < bayeol8.length; j++) {
				if(bayeol8[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol8[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol9 = new int [5][5];
		for(int i = 0; i < bayeol9.length; i++) {
			for (int j = 0; j < bayeol9.length; j++) {
				bayeol9[i][j] = v;
			}
			v++;
		}
		System.out.println("배열 9 수직 12345");
		for(int i = 0; i < bayeol9.length; i++) {
			for (int j = 0; j < bayeol9.length; j++) {
				if(bayeol9[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol9[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol10 = new int [5][5];
		for(int i = 0; i < bayeol10.length; i++) {
			for (int j = i; j < bayeol10.length; j++) {
				bayeol10[i][j] = v++;
			}
			
		}
		System.out.println("배열 10 위 삼각형");
		for(int i = 0; i < bayeol10.length; i++) {
			for (int j = 0; j < bayeol10.length; j++) {
				if(bayeol10[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol10[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol11 = new int [5][5];
		for(int i = 0; i < bayeol11.length; i++) {
			for (int j = i; j < bayeol11.length; j++) {
				bayeol11[i][j] = v*2;
				v++;
			}
			
		}
		System.out.println("배열 11 위 삼각형 2x");
		for(int i = 0; i < bayeol11.length; i++) {
			for (int j = 0; j < bayeol11.length; j++) {
				if(bayeol11[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol11[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol12 = new int [5][5];
		for(int i = 0; i < bayeol12.length; i++) {
			for (int j = i; j < bayeol12.length; j++) {
				bayeol12[i][j] = v*v;
				v++;
			}
			
		}
		System.out.println("배열 12 위 삼각형 제곱");
		for(int i = 0; i < bayeol12.length; i++) {
			for (int j = 0; j < bayeol12.length; j++) {
				if(bayeol12[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol12[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol13 = new int [5][5];
		for(int i = 0; i < bayeol13.length; i++) {
			for (int j = i; j < bayeol13.length; j++) {
				bayeol13[i][j] = j+1;
				
			}
			
		}
		System.out.println("배열 13 위 삼각형 j");
		for(int i = 0; i < bayeol13.length; i++) {
			for (int j = 0; j < bayeol13.length; j++) {
				if(bayeol13[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol13[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol14 = new int [5][5];
		for(int i = 0; i < bayeol14.length; i++) {
			for (int j = i; j < bayeol14.length; j++) {
				bayeol14[i][j] = 2 * v - 1;
				v++;
			}
			
		}
		System.out.println("배열 14 위 삼각형 2x+1");
		for(int i = 0; i < bayeol14.length; i++) {
			for (int j = 0; j < bayeol14.length; j++) {
				if(bayeol14[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol14[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		v=15;
		int[][] bayeol15 = new int [5][5];
		for(int i = 0; i < bayeol15.length; i++) {
			for (int j = i; j < bayeol15.length; j++) {
				bayeol15[i][j] = v;
				v--;
			}
			
		}
		System.out.println("배열 15 위 삼각형 역순");
		for(int i = 0; i < bayeol15.length; i++) {
			for (int j = 0; j < bayeol15.length; j++) {
				if(bayeol15[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol15[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol16 = new int [5][5];
		for(int i = 0; i < bayeol16.length; i++) {
			for (int j = 0; j <= i; j++) {
				bayeol16[i][j] = v;
				v++;
			}
			
		}
		System.out.println("배열 16 밑 삼각형");
		for(int i = 0; i < bayeol16.length; i++) {
			for (int j = 0; j < bayeol16.length; j++) {
				if(bayeol16[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol16[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol17 = new int [5][5];
		for(int i = 0; i < bayeol17.length; i++) {
			for (int j = i; j < bayeol17.length; j++) {
				switch(i) {
				case 0: case 1: case 4:
					if(j % 2 == 1) {
						bayeol17[i][j] = -1;
					} else {
						bayeol17[i][j] = 1;
					}
					break;
				case 2: case 3:
					if(j % 2 == 1) {
						bayeol17[i][j] = 1;
					} else {
						bayeol17[i][j] = -1;
					}
					break;
				}
			}
		}
		System.out.println("배열 17 1 or -1");
		for(int i = 0; i < bayeol17.length; i++) {
			for (int j = 0; j < bayeol17.length; j++) {
				if(bayeol17[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol17[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol18 = new int [5][5];
		for(int i = 0; i < bayeol18.length; i++) {
			for (int j = i; j < bayeol18[i].length - i; j++) {
				bayeol18[i][j] = v;
				v++;
			}
		}
		v=9;
		for(int i = 2; i <bayeol18.length ; i++) {
			for (int j = 4-i ; j<=i; j++) {
				bayeol18[i][j] = v;
				v++;
			}
		}
		System.out.println("배열 18 모래시계");
		for(int i = 0; i < bayeol18.length; i++) {
			for (int j = 0; j < bayeol18.length; j++) {
				if(bayeol18[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol18[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		
		int[][] bayeol19 = new int [5][5];
		for(int i = 0; i < bayeol19.length; i++) {
			for (int j = i; j < bayeol19[i].length - i; j++) {
				bayeol19[j][i] = v;
				v++;
			}
		}
		v=9;
		for(int i = 2; i <bayeol19.length ; i++) {
			for (int j = 4-i ; j<=i; j++) {
				bayeol19[j][i] = v;
				v++;
			}
		}
		System.out.println("배열 19 나비");
		for(int i = 0; i < bayeol19.length; i++) {
			for (int j = 0; j < bayeol19.length; j++) {
				if(bayeol19[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol19[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol20 = new int [5][5];
		for(int i = 0; i < bayeol20.length; i++) {
			bayeol20[0][i] = v;
			v++;
		}
		for(int i = 1; i < bayeol20.length; i++) {
			bayeol20[i][4]=v;
			v++;
		}
		for(int i = bayeol20.length - 2; i >= 0; i--) {
			bayeol20[4][i]=v;
			v++;
		}
		for(int i = bayeol20.length - 2; i > 0; i--) {
			bayeol20[i][0]=v;
			v++;
		}
		for(int i = 1; i < bayeol20.length - 1 ; i++) {
			bayeol20[1][i] = v;
			v++;
		}
		for(int i = 2; i < bayeol20.length - 1 ; i++) {
			bayeol20[i][3] = v;
			v++;
		}
		for(int i = 2; i >= 1 ; i--) {
			bayeol20[3][i] = v;
			v++;
		}
		for(int i = 1; i < bayeol20.length-2 ; i++) {
			bayeol20[2][i] = v;
			v++;
		}
		System.out.println("배열 20 소용돌이");
		for(int i = 0; i < bayeol20.length; i++) {
			for (int j = 0; j < bayeol20.length; j++) {
				if(bayeol20[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol20[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
		int[][] bayeol21 = new int [5][5];
		for(int i = 0; i < bayeol21.length-2; i++) {
			for(int j = 2 - i; j < bayeol21.length + (i-2); j++) {
				bayeol21[i][j] = 2*v - 1;
				v++;
			}
		}
		for(int i = 3; i < bayeol21.length; i++) {
			for(int j = i-2; j <= bayeol21.length - i+1; j++) {
				bayeol21[i][j] = 2*v - 1;
				v++;
			}
		}
		System.out.println("배열 21 마름모");
		for(int i = 0; i < bayeol21.length; i++) {
			for (int j = 0; j < bayeol21.length; j++) {
				if(bayeol21[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol21[i][j] + "\t");
				}
			}
			
			System.out.println();
		}
		v = 1;
		System.out.println();
		
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
		System.out.println("배열 22 뱀");
		for(int i = 0; i < bayeol22.length; i++) {
			for (int j = 0; j < bayeol22.length; j++) {
				if(bayeol22[i][j] == 0) {
					System.out.print(" \t");
				} else {
					System.out.print(bayeol22[i][j] + "\t");
				}
			}
			System.out.println();
		}
		v = 1;
		System.out.println();
		
	}

}
