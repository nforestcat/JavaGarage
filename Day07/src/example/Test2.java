package example;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			byte jumsu = sc.nextByte();
			switch(jumsu) {
			case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
				System.out.println("A");
				break;
			case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
				System.out.println("B");
				break;
			case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
				System.out.println("C");
				break;
			default:
				System.out.println("판단불가");
				break;
			}
			sc.close();
		
			
	}

}
