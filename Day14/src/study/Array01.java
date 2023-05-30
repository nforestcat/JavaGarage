package study;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = new char[9][9];
		/*for(int i = 0; i<arr.length-4; i++) {
			for(int j = 4 - i; j < arr.length + (i - 4); j++) {
				arr[i][j] = 42;
			}
		}
		for(int i = 5; i < arr.length ; i++) {
			for(int j = i - 4; j < arr.length - (i-4); j++) {
				arr[i][j] = 42;
			}
		}
		*/
		
		
		for(int  i = 0; i<arr.length; i++){
		 	if(i < 5){
		 		for(int j = 4 - i; j < arr.length - (4 - i); j++) {
					arr[i][j] = 42;
				}
		 	} else {
		 		for(int j = i - 4; j < arr.length - (i-4); j++) {
					arr[i][j] = 42;
				}
		 	}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
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
