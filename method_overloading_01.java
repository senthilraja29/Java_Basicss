package Day07_09July;

public class method_overloading_01 {

	static void abcd() {
		System.out.println("1");
	}
	
	static void abcd(int a) {
		System.out.println("2");
	}
	
	static void abcd(String abc) {
		System.out.println("3");
	}
	
	static void abcd(String a, char c, double z) {
		System.out.println("4");
	}
	
	
	void efg() {
		System.out.println("5");
	}
	
	void efg(boolean a) {
		System.out.println("6");
	}
	
	void efg(String abc) {
		System.out.println("7");
	}
	
	void efg(String a, char c, double z) {
		System.out.println("8");
	}
	
	/*
	void abcd() 
	{}
	*/
	
	
	public static void main(String[] args) {
	
		abcd();
		abcd(10);
		abcd("senthil");
		abcd("raja", 'S', 10.69874);
		
		method_overloading_01 q1 = new method_overloading_01(); // for calaling non static we used contructions
		
		System.out.println("Its non static methods");
		q1.efg();
		q1.efg(true);
		q1.efg("Bhavani");
		q1.efg("senbha", 'w', 10.2345);
	}
}
