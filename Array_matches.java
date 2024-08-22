package Day20_26July;

public class Array_matches {

	public static void main(String[] args) {
		
	String a = "Somu";
	
			
	System.out.println(a.matches("S(.*)")); // starts with s
	
	System.out.println(a.matches("....")); // 4 letters
	
	System.out.println(a.matches("(.*)u")); // end with u
	
	System.out.println(a.matches("(.*)m(.*)")); //middle with m
	
	}
}
