package Day25_2Aug;

public class Assignment_046_loop_cant_start 
{
	public static void main(String[] args) 
	{
		System.out.println("For Loop didn't Starts");
		
		for(int q = 0; q > 10; q++) 
		{
			System.out.println(q);
		}
		
		System.out.println("While Loop didn't Starts");
		
		int w = 0;
		while(w > 10)
		{
			System.out.println(w);
			w++;
		}
	}
}
