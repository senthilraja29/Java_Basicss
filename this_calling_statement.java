package Day15_19July;

class flipkart{
	
	flipkart(){
		
		this(100);
		System.out.println("Purchase - 1");
	}
	flipkart(int a){
		
		this("Happy");
		System.out.println("Purchase - 2");
	}
	flipkart(String B){
		
		System.out.println("Purchase - 3");
	}
}

public class this_calling_statement extends flipkart {

	public static void main(String[] args) {
		new flipkart(10);	
	}
	
}
