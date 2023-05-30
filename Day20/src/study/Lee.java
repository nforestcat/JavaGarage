package study;

public class Lee extends Character{
	Lee(){
		level = 1;
		hp = 20;
		maxHp = 20;
		exp = 0;
		energy = 30;
		System.out.println("create 이상해씨");
		printInfo();
	}
	public void eat() {
		hp += 5;
		energy += 5;
		if(hp > maxHp) {
			hp = maxHp;
		}
	}
	public void sleep() {
		hp += 10;
		energy += 20;
		if(hp > maxHp) {
			hp = maxHp;
		}
		
	}
	public boolean play(){
		hp -= 5;
		energy -= 10;
		exp += 10;
		levelUp();
		return checkEnergy();
	}
	public boolean train() {
		hp -= 10;
		energy -= 10;
		exp += 20;
		levelUp();
		return checkEnergy();
		
	}
	public void levelUp() {
		if(exp >= 35) {
			level++;
			maxHp += 10;
			hp = maxHp;
			exp = 0;
		}
	}
}
