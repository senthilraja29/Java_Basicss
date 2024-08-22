package Day06_08July;

public class static_vs_non_static {

	static void add() {
		
		int a = 10;
		int b = 30;
		
		int sum = a+b;
		
		System.out.println("Static method output " + sum);
	} 
	
	void addition() {
		
		int q = 50;
		int w = 60;
		
		int sum = q+w;
		
		System.out.println("\nNon static method output is below");
		System.out.println("Non Static method output is " + sum);
	}
	
	public static void main(String[] args) {
		
		add();
		
		static_vs_non_static x = new static_vs_non_static();
		x.addition();
	}
}
