package Day_Four;

public class static_ {

	
	private static int rec = 10; 
	int l;
	int b;
	int w;
	
	public void rectang() {
		System.out.println("Going to print rectangle value");
	}
	
	public static_ () {
	    rec++;
	}
	
	public static int getrec() {
		return rec;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Before incremental " +  static_.getrec());
		
		static_ rectangle = new static_();
		
		rectangle.l = 25;
		rectangle.b = 10;
		rectangle.w = 15;
		
		System.out.println("After incremental "+ static_.getrec());
		System.out.println("Get Rectangle value is " + rectangle.getrec());
		
		
		int X = rectangle.l * rectangle.b * rectangle.w ;
		
		
		
		System.out.println("Before Static rec value is " + rec);
		
		rectangle.rectang();
		
		System.out.println("Rectangle value is " + X);
		System.out.println("rectangle.l is " + rectangle.l);
		System.out.println("rectangle.b is " + rectangle.b);
		System.out.println("rectangle.w is " + rectangle.w);
		
		System.out.println("After Static rec value is " + rec);

	}

}
