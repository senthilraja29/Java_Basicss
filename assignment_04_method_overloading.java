package Day07_09July;

public class assignment_04_method_overloading {
	
	void display() {
		System.out.println("calling modifiers without input");
	}
	
	void display(int a) {
		System.out.println("calling modifiers with integer input");
	}
	
	void display(String a) {
		System.out.println("calling modifiers with String input");
	}
	
	void display(int x, String a, boolean y) {
		System.out.println("calling modifiers with multiple input");
	}
	
	public static void main(String[] args) {
	
		
	//Building object for calling non-static modifiers
	assignment_04_method_overloading dis_play = new assignment_04_method_overloading(); 
	
	dis_play.display();
	dis_play.display(10);
	dis_play.display("Happy");
	dis_play.display(0,"tuesday",true);
	
	}
}
