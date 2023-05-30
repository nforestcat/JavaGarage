package study;

import java.util.Scanner;

public class PlayGame {
	Character character;
	int menu;
	PlayGame(Character character){
		this.character = character;
	}
	void printMenu(Scanner sc) {
		System.out.println("1. 밥 먹기  2. 잠 자기   3. 놀아주기  4.  운동  5. 종료");
		menu = sc.nextInt();
		play();
	}
	public void play() {
		//게임이 while문 안에서 동작
		switch(menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("잘못 선택하셨습니다.");
		}
	}
}
