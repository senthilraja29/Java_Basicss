package Day_Four;

public class static_nested_outer {

	private static class static_nested_inner {
		
		public void nested_display() {
			System.out.println("Happy Sunday - Welcome to Home");
			
		}
	}

	
	public static void main(String[] args) {
	
		static_nested_outer.static_nested_inner nested = new static_nested_outer.static_nested_inner();
		nested.nested_display();
		
		
	}
	
	
	
	
	
	
	
}
