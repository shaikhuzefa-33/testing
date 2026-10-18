package training.interfaceEx;


interface Father {
	double Property = 10000;
	double Height = 5.6;

}

interface Mother {
	double Property = 30000;
	double Height = 5.4;

}

class MyClass implements Father,Mother {
	void show() {
		System.out.println("Total property is :" +(Father.Property + Mother.Property));
		System.out.println("Average height is :" +(Father.Height + Mother.Height)/2);
		
	}
	
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.show();
	}

}
