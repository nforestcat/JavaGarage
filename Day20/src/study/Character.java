package study;

public abstract class Character {
	int hp;
	int maxHp;
	int exp;
	int level;
	int energy;
	Character(){
		
	}
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	public boolean checkEnergy() {
		if(energy <= 0 || hp <= 0) {
			return true;
		}
		return false;
	}
	public void printInfo() {
		System.out.println("=====현재 캐릭터의 정보 출력=====");
		System.out.println("HP : " + hp + " / " + maxHp);
		System.out.println("EXP : " + exp);
		System.out.println("Level : " + level);
		System.out.println("Energy : " + energy);
		System.out.println("=================================");
	}
}
