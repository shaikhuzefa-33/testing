package training.poly;

class Addition {

	void add (int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
}


public class PolyAddition{
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(1, 2);
		obj.add(3, 4, 5);
		obj.add(5, 6, 7, 8);
	}
}