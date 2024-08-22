package Day_three;

public class super_keyword {
	
	class A {
		// Construction of the class A
		public A() {
			super();
			System.out.println("Happy in A"); }
		
		// Another Construction of the class B
		public A(int n) {
		//	super();
			this();
			System.out.println("Happy in A int n");
	}
	}
	class B extends A {
		// Construction of the class B
		public B() {
			super(7);  // this executes A int
			System.out.println("Happy in B"); }
		
		// Another Construction of the class B
		public B(int n) {
			super(n); // if we are not entering n in super class it won't reflect A
			System.out.println("Happy in B int n"); }	
	}
	
	public static void main(String[] args) {
		
		 super_keyword outerObj = new super_keyword();
	   //  B obj = outerObj.new B(); 
	     B obj = outerObj.new B();
	}
	
	
}
	