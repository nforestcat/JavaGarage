package study;

public class FunctionExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b=10, c=10;
		/*
		while( a == 10) {
			a = rando();
		}
		while ( b == a || b == 10 ) {
			b = rando();
		}
		while( c == b || c == a || c == 10 ) {
			c = rando();
		}
		*/
		
		while( a == b || a == c || b == c ||a == 10 ||b == 10||c == 10) {
			a = rando();
			b = rando();
			c = rando();
		}
		System.out.printf("%d%d%d",a, b, c);
		
		System.out.println();
		
		int[] num = new int[3];
		boolean reroll = false;
		int temp;
		int i = 0;
		do {
			temp = rando();
			reroll = false;
			num[i] = temp;
			if(i == 0) {
				if(temp == 10) {
					continue;
				}
				i++;
				continue;
			}
			for(int j = 0; j < 3; j ++) {
				if((num[j]==temp && i != j) || temp == 10) {
					reroll = true;
					break;
				}
			}
			if(reroll) {
				i--;
			}
			i++;
		} while(i < 3);
		for(int j = 0; j < 3; j++) {
			System.out.print(num[j]);
		}
		
		System.out.println();
		i = 0;
		
		do {
			temp = randomNum();
			reroll = false;
			num[i] = temp;
			if(i == 0) {
				i++;
				continue;
			}
			for(int j = 0; j < 3; j ++) {
				if(num[j]==temp && i != j) {
					reroll = true;
					break;
				}
			}
			if(reroll) {
				i--;
			}
			i++;
		} while(i < 3);
		for(int j = 0; j < 3; j++) {
			System.out.print(num[j]);
		}
	}
	public static int rando() {
		int num = (int) (Math.random()*10 + 1);
		return num;
	}
	
	public static int randomNum() {
		int num = (int) (Math.random()*9 + 1);
		return num;
	}
}
