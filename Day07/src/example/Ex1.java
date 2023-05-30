package example;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte jumsu = sc.nextByte();
		if( jumsu >= 90) {
			System.out.println("A");
		} else if ( jumsu >= 80) {
			System.out.println("B");
		} else if ( jumsu >= 70) {
			System.out.println("C");
		} else {
			System.out.println("판단불가");
		}
		sc.close();
	}

}
