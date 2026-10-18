package training.poly;
class Parent {
	void method1() {
		System.out.println("I am parent");
	}
	
}

class Child extends Parent{
	void method1() {
		System.out.println("I am child");
		System.out.println("I have additional property");
	}
}
public class overRiding {
	public static void main(String[] args) {
		Parent obj= new Child();
		obj.method1();
	}

}
