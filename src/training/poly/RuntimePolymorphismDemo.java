package training.poly;

class Animal {
	void makesound() {
		System.out.println("Animal makes sound");
		
	}
}

class Dog extends Animal{
	void makesound() {
		System.out.println("Dog barks");
		
	}
	
}

class Lion extends Animal{
	void makesound() {
		System.out.println("lion roars");
	}
}

public class RuntimePolymorphismDemo {
 public static void main(String[] args) {
	Animal myanimal = new Dog();
	myanimal.makesound();
	myanimal = new Lion();
	myanimal.makesound();
}
}
