package study;

public class Pikachu extends Character {
	Pikachu(){
		level = 1;
		hp = 30;
		maxHp = 30;
		exp = 0;
		energy = 50;
		System.out.println("create pikachu");
		printInfo();
	}
	public void eat() {
		hp += 5;
		energy += 10;
		energy += 5;
		if(hp > maxHp) {
			hp = maxHp;
		}
	}
	public void sleep() {
		hp += 10;
		energy += 15;
		energy += 5;
		if(hp > maxHp) {
			hp = maxHp;
		}
	}
	public boolean play(){
		hp -= 10;
		energy -= 20;
		exp += 20;
		levelUp();
		return checkEnergy();
	}
	public boolean train() {
		hp -= 20;
		energy -= 30;
		exp += 30;
		levelUp();
		return checkEnergy();
	}
	public void levelUp() {
		if(exp >= 40) {
			level++;
			maxHp += 7;
			hp = maxHp;
			exp = 0;
		}
	}
}
