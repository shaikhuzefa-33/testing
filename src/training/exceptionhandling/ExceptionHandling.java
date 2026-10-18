package training.exceptionhandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			
			int c = a/b;
			System.out.println("Result ="+c);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception caught:Division by zero");
			
		}
		finally {
			System.out.println("Finally block executed");
			
		}
		System.out.println("Program continues normally");
	}

}


