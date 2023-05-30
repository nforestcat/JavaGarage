package study;

import java.util.*;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Character character = null;
		PlayGame pg = null;
		System.out.println("캐릭터를 선택해주세요");
		System.out.println("1. 피카츄 2. 꼬북이 3.이상해씨");
		int x = sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("피카츄를 선택하셨습니다.");
			character = new Pikachu();
			break;
		case 2:
			System.out.println("꼬북이를 선택하셨습니다.");
			character = new Gobook();
			break;
		case 3:
			System.out.println("이상해씨를 선택하셨습니다.");
			character = new Lee();
			break;
		default:
			System.out.println("없는 캐릭터 입니다.");
			break;
		}
		if(character == null) {
			System.out.println("게임을 종료합니다.");
			sc.close();
			return;
		} else {
			pg = new PlayGame(character);
			//pg.play();
		}
		while (true) {
			pg.printMenu(sc);
			
		}
		
		
	}

}
