package Day17_23July;

public class String_Function {

	public static void main(String[] args) {
	
		String name  = "My name is Senthil Raja";
		String na_me = "       my name is Senthil Raja      ";
		
		System.out.println(name.trim());
		System.out.println(na_me.trim());
		
		
		String a = "TCS";
		String b = "tcs";
		String c = " is a company";	
		System.out.println(a.equals(b));
	
		System.out.println(a.concat(c));
		
		System.out.println(a.equalsIgnoreCase(b));
	}
}
