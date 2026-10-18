package training.abstraction;

	class Parent {
		void method1() {
			System.out.println("I am parent1");
		}

		
		void method2() { 
			  System.out.println("I am parent2"); 
			  }
		  
		void method3() {
			System.out.println("I am parent3");
		}
	
		void method4() {
			System.out.println("I am parent4");
		}
		void method5() {
			System.out.println("I am parent5");
		}
		
	}

	
	public class DataAbstactionEx {
		public static void main(String[] args) {
			Parent obj= new Parent();
			
			  obj.method1(); 
			  obj.method2(); 
			  obj.method3(); 
			  obj.method4(); 
			  obj.method5();
			 
		}

	}


