package Day35_16Aug;

public class Assignment_053_str_Buf_build 
{
	public static void main(String[] args) 
	{
		System.out.println("-String Builder-");
		StringBuffer s1 = new StringBuffer("Good Morning");
		s1.append(", Senthil");
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println(s1.isEmpty());
		System.out.println(s1.reverse());
		System.out.println(s1.reverse());
		System.out.println(s1.length());
		System.out.println(s1.substring(0, 9));
		System.out.println(s1.substring(4));
		
		System.out.println("\n-String Buffer-");
		StringBuilder s2 = new StringBuilder("Welcome to ");
		s2.append("StringBuilder ");
		System.out.println(s2);
		System.out.println(s2.capacity());
		System.out.println(s2.isEmpty());
		s2.trimToSize();
		s2.ensureCapacity(50);
		System.out.println(s2.capacity());
		System.out.println(s2.substring(0));
		System.out.println(s2.substring(0, 9));
		System.out.println(s2.reverse());
	}
}
