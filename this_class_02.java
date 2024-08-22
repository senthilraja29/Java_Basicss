package Day_three;

public class this_class_02 {

	String A,B;
	this_class_02(String A,String B)
	
	{
		A = A; // A = A this print out empty
		this.B = B;	// B = B this print out empty
	}
		
		void display()
	{
			System.out.println(A);
			System.out.println(B);
		}
	
	
	
	public static void main(String[] args) {
	
		this_class_02 excute = new this_class_02("Sunday", "Monday");
		excute.display();
	}


}
