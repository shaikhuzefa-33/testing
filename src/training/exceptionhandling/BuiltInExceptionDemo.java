package training.exceptionhandling;

public class BuiltInExceptionDemo {
    private static String str;

	public static void main(String[] args) {
        // 1. ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
        // 2. NullPointerException
        try {
            str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
        // 3. ArrayIndexOutOfBoundsException
        try {
            int arr[] = new int[5];
            arr[10] = 50;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
        System.out.println("Program executed successfully");
    }
}
