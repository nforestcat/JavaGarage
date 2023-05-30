package study;

public class Gobook extends Character {
	Gobook(){
		level = 1;
		hp = 40;
		maxHp = 40;
		exp = 0;
		energy = 50;
		System.out.println("create 꼬북이");
		printInfo();
	}
	public void eat() {
		hp += 15;
		energy += 15;
		if(hp > maxHp) {
			hp = maxHp;
		}
	}
	public void sleep() {
		hp += 10;
		energy += 10;
		if(hp > maxHp) {
			hp = maxHp;
		}
	}
	public boolean play(){
		hp -= 15;
		energy -= 30;
		exp += 15;
		return checkEnergy();
	}
	public boolean train() {
		hp -= 20;
		energy -= 40;
		exp += 25;
		levelUp();
		return checkEnergy();
	}
	public void levelUp() {
		if(exp >= 50) {
			level++;
			maxHp += 5;
			hp = maxHp;
			exp = 0;
		}
	}
}
