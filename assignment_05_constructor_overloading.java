package Day07_09July;

public class assignment_05_constructor_overloading {
	
	assignment_05_constructor_overloading(){
		System.out.println("Without Input constructor calling");
	}
	
	assignment_05_constructor_overloading(int b){
		System.out.println("With integer Input constructor calling");
	}
	
	assignment_05_constructor_overloading(String b){
		System.out.println("With String Input constructor calling");
	}
	
	assignment_05_constructor_overloading(int x,boolean g, String q){
		System.out.println("With Multiple Input constructor calling");
	}
	
	public static void main(String[] args) {
		
	new assignment_05_constructor_overloading();
	
	assignment_05_constructor_overloading type_2 = new assignment_05_constructor_overloading(0);
	
	new assignment_05_constructor_overloading("Tuesday");
	
	new assignment_05_constructor_overloading(0, true,"Welcome");
	
	}

}
