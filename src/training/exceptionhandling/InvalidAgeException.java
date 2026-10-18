package training.exceptionhandling;

class UserDefinedExceptionDemo  extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UserDefinedExceptionDemo (String msg) {
        super(msg);
    }
}
// Main class
public class InvalidAgeException{
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new UserDefinedExceptionDemo ("Age is not valid for voting");
            } else {
                System.out.println("Eligible for voting");
            }
        }
        catch (UserDefinedExceptionDemo  e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues normally");
    }
}
