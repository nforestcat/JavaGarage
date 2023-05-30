package my_casting;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalAction aa = new AnimalAction();
		Animal dog = new Dog();
		aa.action(dog);
		Animal cat = new Cat();
		aa.action(cat);
		
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[0].name = "멍멍이";
		animal[1] = new Cat();
		animal[1].name = "야옹이";
		for(int i = 0; i < 2; i++) {
			aa.action(animal[i]);
		}
		
	}

}
class AnimalAction{
	void action(Animal animal) {
		animal.cry();
		if(animal instanceof Dog dog) {
			((Dog) animal).run();
		}
		if(animal instanceof Cat cat) {
			((Cat)animal).grooming();
		}
	}
}

class Animal{
	protected String name;
	public void cry() {
		System.out.println(name + " 가 소리낸다.");
	}
}

class Dog extends Animal{
	Dog(){
		name = "개";
	}
	public void cry() {
		super.cry();
		System.out.println("멍멍");
	}
	public void run() {
		System.out.println(name + "가 뛴다");
	}
}

class Cat extends Animal{
	Cat(){
		name = "고양이";
	}
	public void cry() {
		super.cry();
		System.out.println("야옹");
	}
	public void grooming() {
		System.out.println("그루밍한다");
	}
}