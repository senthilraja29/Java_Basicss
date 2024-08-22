package Day16_22July;

class amazon{
	amazon(String a){
//		this();
		System.out.println("Amazon Empty Input - Happy");	
	}

	amazon(){
//		this("ok");
	System.out.println("Amazon Empty Input - this statement");	}
	}

class flipkart_ extends amazon {
	flipkart_(){
//		this("happy");
		System.out.println("Flipkart Empty Input - Happy");
	}
	flipkart_(int a){
//		super("Sad");
		System.out.println("Flipkart With Integer Input");
	}
	flipkart_(String x){
		super("no");
		System.out.println("Flipkart Empty Input");
	}
}

public class Assignment_030_thiskeyword extends flipkart_ {

	public static void main(String[] args) {
		
	new flipkart_(10);
		
	}
}
