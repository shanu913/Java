package Super;

public class SuperMethod {

	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends SuperMethod {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}
