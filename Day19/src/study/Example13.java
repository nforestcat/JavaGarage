package study;

import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		String word = sc.next();
		char[] letter = new char[word.length()];
		char temp;
		for(int i = 0; i < word.length(); i++) {
			temp =word.charAt(i);
			if(temp == 97) {
				letter[i] = 96;
			} else if(temp == 98) {
				letter[i] = 126;
			} else if(temp == 99) {
				letter[i] = 33;
			} else if(temp == 100) {
				letter[i] = 64;
			} else if(temp == 101) {
				letter[i] = 35;
			} else if(temp == 102) {
				letter[i] = 36;
			} else if(temp == 103) {
				letter[i] = 37;
			} else if(temp == 104) {
				letter[i] = 94;
			} else if(temp == 105) {
				letter[i] = 38;
			} else if(temp == 106) {
				letter[i] = 42;
			} else if(temp == 107) {
				letter[i] = 40;
			} else if(temp == 108) {
				letter[i] = 41;
			} else if(temp == 109) {
				letter[i] = 45;
			} else if(temp == 110) {
				letter[i] = 95;
			} else if(temp == 111) {
				letter[i] = 43;
			} else if(temp == 112) {
				letter[i] = 61;
			} else if(temp == 113) {
				letter[i] = 124;
			} else if(temp == 114) {
				letter[i] = 91;
			} else if(temp == 115) {
				letter[i] = 93;
			} else if(temp == 116) {
				letter[i] = 123;
			} else if(temp == 117) {
				letter[i] = 125;
			} else if(temp == 118) {
				letter[i] = 59;
			} else if(temp == 119) {
				letter[i] = 58;
			} else if(temp == 120) {
				letter[i] = 44;
			} else if(temp == 121) {
				letter[i] = 46;
			} else if(temp == 122) {
				letter[i] = 47;
			} else if(temp == 48) {
				letter[i] = 113;
			} else if(temp == 49) {
				letter[i] = 119;
			} else if(temp == 50) {
				letter[i] = 101;
			} else if(temp == 51) {
				letter[i] = 114;
			} else if(temp == 52) {
				letter[i] = 116;
			} else if(temp == 53) {
				letter[i] = 121;
			} else if(temp == 54) {
				letter[i] = 117;
			} else if(temp == 55) {
				letter[i] = 105;
			} else if(temp == 56) {
				letter[i] = 111;
			} else if(temp == 57) {
				letter[i] = 112;
			}
		}
		System.out.print("result: ");
		for(int i = 0; i < letter.length; i++) {
			System.out.print(letter[i]);
		}
		
		sc.close();
	}
	
}
