package training.exceptionhandling;

public class MultipleCatchDemo {
	  public static void main(String[] args) {

	        try {
	            int a = 10;
	            int b = 0;
	            
	            int c =a/b;
	            System.out.println(c);

	            int arr[] = {1, 2, 3};
	            // This will cause ArrayIndexOutOfBoundsException
	            System.out.println(arr[5]);

	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception occurred: " + e);
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Out Of Bounds Exception occurred: " + e);
	        } 
	        catch (Exception e) {
	            System.out.println("General Exception occurred: " + e);
	        }

	        System.out.println("Program continues after exception handling.");
	    }}
