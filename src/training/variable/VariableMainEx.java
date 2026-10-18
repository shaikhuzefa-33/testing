package training.variable;

public class VariableMainEx {
	
	public static void main(String[] args) {
		
		
		LocalVariableEx o=new LocalVariableEx();
		
		o.method();
		
		
		
		IntanceVaraibleEx obj = new IntanceVaraibleEx();  
	        System.out.println("Student Name is: " + obj.name);  
	        System.out.println("Age: "+ obj.age);  
	        
	        System.out.println("static value is "+StaticEx.name);
	        StaticEx.mathod3();
	}

}