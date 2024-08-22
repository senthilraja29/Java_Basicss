package Day07_09July;

public class method_overloadingg {

	static void sub() {
		int a = 40;
		int b = 20;
		
		int sub = a - b;
		System.out.println(sub);
	}
	
	static void sub(int x){
		int a = 155;
		int b = 20;
		
		int sub = a - b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		sub();
		sub(10);
	}
}
