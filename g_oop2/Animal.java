package g_oop2;

public abstract class Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		Tiger t = new Tiger();
		t.sound();
		Cat c = new Cat();
		c.sound();
	}

	void run(){
		System.out.println("달려간다~~");
	}
	
	abstract void sound();
	
}

class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍!!");
	}
	
}

class Tiger extends Animal{

	@Override
	void sound() {
		System.out.println("어흥~~!!");
		
	}
	
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("야옹~~");
		
	}
	
}
