package test;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.makeSound();
		cat.makeSound();
	}

}
interface Animal{
	void makeSound();
}
class Dog implements Animal{
	public void makeSound() {
		System.out.println("멍멍");
	}
}
class Cat implements Animal{
	public void makeSound() {
		System.out.println("야옹");
	}
}